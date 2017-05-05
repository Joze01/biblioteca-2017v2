/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;
import java.sql.*;
import sv.edu.sv.bean.*;
/**
 *
 * @author Jose
 */
public class usuario {
    Conexion con;
    String sql;
    ResultSet rs;
    public int nuevoUsuario(usuarioBean user) throws SQLException{
        boolean resultado = false;
        int valor=0;
        con = new Conexion();
        int cantidad=0;
        
        sql="select count(*) from usuario where usuario_carnet='"+user.getCarnet()+"'";
        System.out.println(sql);
        con.setRs(sql);
        rs=con.getRs();
        
        while(rs.next()){
            System.out.println("DATOS ENCONTRADOS: "+rs.getInt(1));
            cantidad=rs.getInt(1);
        }
        con.cerrarConexion();
        
        if(cantidad==0){
            con= new Conexion();
        sql = "INSERT INTO usuario(usuario_nombre, usuario_apellido, usuario_carnet, id_tipousuario, usuario_password) VALUES ('"+user.getNombre()+"','"+user.getApellido()+"','"+user.getCarnet()+"',"+user.getTipousuario()+",'"+user.getPassword()+"')";
            System.out.println(sql);
        resultado = con.setQuery(sql);
        con.cerrarConexion();
        if(resultado){
        valor= 1;
        }else{
        valor=0;
        }
        
        }else if(cantidad!=0){
        valor=2;
        }
        
        
        
        
        return valor;
    }
    
    
    public void modificarUsuario(usuarioBean user){
    
    
    }
    
    public boolean eliminarUsuario(int id) throws SQLException{
            boolean resultado = false;
            con = new Conexion();
            sql = "Delete from usuario where usuario_id="+id;
            resultado = con.setQuery(sql);
            return resultado;
    }
    
}
