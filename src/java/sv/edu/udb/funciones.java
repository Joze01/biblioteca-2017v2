/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;
import java.sql.*;
/**
 *
 * @author Jose
 */
public class funciones { ///clase para funciones especificas del sistema
    Conexion con; //conexion
    ResultSet rs; //resutlset
    String sql;
    public boolean logear(String password, String user) throws SQLException{
        boolean correcto = false;
        sql="select count(*) ,usuario_nombre,tipousuario_nombre  from usuario inner join tipousuario on usuario.id_tipousuario=tipousuario.tipousuario_id where usuario.usuario_carnet='"+user+"' and usuario.usuario_password='"+password+"'";
        con = new Conexion();
        con.setRs(sql);
        rs=con.getRs();
        while(rs.next()){
            if(rs.getInt(1)==1){
            correcto=true;
            }else{
                correcto=false;
            }
        }
        con.cerrarConexion();
        
        return correcto;
    }
    
    
    public void newEditorial(String nombre, String descripcion) throws SQLException{
    sql="INSERT INTO editorial (editorial_nombre, editorial_descripcion) VALUES ('"+nombre+"', '"+descripcion+"')";
    con= new Conexion();
    con.setQuery(sql);
    
    }
}
