/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sv.edu.sv.bean.usuarioBean;
/**
 *
 * @author Jose
 */
public class login {
    Conexion con; //conexion
    ResultSet rs; //resutlset
    String sql;
    
    public boolean iniciarSession(String user, String password){
        boolean resultado=false;
        try {
            con= new Conexion();
            sql="SELECT count(usuario_id),"
                    + " usuario_id, "
                    + "usuario_nombre,"
                    + " usuario_apellido,"
                    + " usuario_carnet,"
                    + " id_tipousuario,"
                    + " usuario_password"
                    + " FROM usuario"
                    + " where usuario_carnet='"+user+"' and usuario_password='"+password+"'";
            con.setRs(sql);
            System.out.println(sql);
            rs=con.getRs();
            while(rs.next()){
                if(rs.getInt(1)==1){
                resultado=true;
                    System.out.println("Valor de RS: "+rs.getInt(1));
                }
            }
            con.cerrarConexion();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return resultado;
    }
    
    public usuarioBean getDatos(String user, String password){
        usuarioBean usuario_b = new usuarioBean();
        
        try {
            con= new Conexion();
        
            sql="SELECT count(usuario_id),"
                    + " usuario_id, "
                    + "usuario_nombre,"
                    + " usuario_apellido,"
                    + " usuario_carnet,"
                    + " id_tipousuario,"
                    + " usuario_password"
                    + " FROM usuario"
                    + "     where usuario_carnet='"+user+"' and usuario_password='"+password+"'";
            con.setRs(sql);
            rs=con.getRs();
            while(rs.next()){
                usuario_b.setId(rs.getInt(2));
                usuario_b.setNombre(rs.getString(3));
                usuario_b.setApellido(rs.getString(4));
                usuario_b.setCarnet(rs.getString(5));
                usuario_b.setTipousuario(rs.getInt(6));
                usuario_b.setPassword(rs.getString(7));
            }
            con.cerrarConexion();
        
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario_b;
    }
    
    
}
