/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import sv.edu.sv.bean.configuracionBean;
import sv.edu.sv.bean.prestamoBean;
/**
 *
 * @author Jose
 */
public class prestamo {
    Conexion con;
        String sql;
        ResultSet rs;
        boolean resultado=false;
        int maximos=0;
        double mora=0;
        public boolean nuevoPrestamo(prestamoBean pres){
           
             try {
              
               
               if(!this.maximo(pres.getUsuario(),pres.getTipo())==false){
                     if (this.mora>0) {
                          int ejemplares=0;
                          con=new Conexion();
                          sql="select ejemplares from material where material_id="+pres.getMaterial();
                          con.setRs(sql);
                          rs = con.getRs();
                          while(rs.next()){
                          ejemplares=rs.getInt(1); //Ejemplares disponibles
                          }
                         
                          System.out.println("Ejemplares"+ejemplares);
                          
                         if(ejemplares>0) {
                         sql="INSERT INTO prestamo (id_material, prestamo_fechaActual, prestamo_fechaDevolucion, id_usuario, estado) VALUES ("+pres.getMaterial()+", CURRENT_DATE(), CURRENT_DATE()+1, "+pres.getUsuario()+", 1)";
                         System.out.println(sql);
                         
                         resultado=con.setQuery(sql);
                         System.out.println("RESULTADO: "+resultado);
                         
                         
                        sql="update material SET ejemplares=ejemplares-1 where material_id="+pres.getMaterial();
                         con.setQuery(sql);
                         }else{
                         return false;
                         }
                         
                     }
                     
                     
                     
                     
                     
               }
            con.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             
             
             
        return resultado;
        }
        

//1 root
//2 docente
//3 Alumno
        
        
        public boolean maximo(int usuario, int tipo){
            boolean resultado=false;

        try {
            con =new Conexion();
            sql="select * from configuracion  where estado=1";
            con.setRs(sql);
            rs =con.getRs();
            while(rs.next()){
             mora = rs.getInt("configuracion_mora");
             if(tipo ==1){
             maximos=99;
             }else if (tipo==2){
             maximos=rs.getInt("configuracion_docente");
             }else if(tipo==3){
             maximos=rs.getInt("configuracion_alumno");
             }
             
             con= new Conexion();
             sql="select count(*) from prestamo where estado=1 and id_usuario="+usuario;
             con.setRs(sql);
             rs=con.getRs();
             while(rs.next()){
             if(rs.getInt(1)>=maximos){
             return false;
             
             }else{
             return true;
             }
             }
             
             
             
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        sql="select * from configuracion  where estado=1";
        con.setRs(sql);
        
        return resultado;
        }
        
        public double mora(int usuario){
             int encontrados = 0;
        try {
           
            con = new Conexion();
            sql="select count(*) from prestamo where id_usuario="+usuario+" and  DATEDIFF(CURRENT_DATE(),prestamo_fechaDevolucion) > 0";
            con.setRs(sql);
            rs = con.getRs();
            while(rs.next()){
            encontrados = rs.getInt(1);
            }
            
            if(usuario==1){
            encontrados=0;
            }
            System.out.println("Prestamos Encontrados"+encontrados);
            
            
            return mora * encontrados;
        } catch (SQLException ex) {
            Logger.getLogger(prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
         return mora * encontrados;
        }
    
    
        public boolean devolucion(Integer datopres, Integer material){
        try {
            con = new Conexion();
           sql="UPDATE prestamo SET estado = 0 WHERE prestamo_id="+datopres;
            resultado=con.setQuery(sql);
            System.out.println(sql);
            
            sql="update material Set ejemplares=ejemplares+1 where material_id="+material;
            con = new Conexion();
           resultado= con.setQuery(sql);
            System.out.println(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            
            
            
            return resultado;
        }
    
    
}
