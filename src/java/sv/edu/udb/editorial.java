/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;
import java.sql.ResultSet;
import java.sql.SQLException;
import sv.edu.sv.bean.editorialBean;
/**
 *
 * @author Jose
 */
public class editorial {
        Conexion con;
        String sql;
        ResultSet rs;
        boolean resultado=false;
    public boolean nuevaEditorial(editorialBean editorial) throws SQLException{
        resultado=false;
        sql="INSERT INTO editorial (editorial_nombre, editorial_descripcion) VALUES ('"+editorial.getNombre()+"','"+editorial.getDescripcion()+"')";
        con=new Conexion();
        resultado=con.setQuery(sql);
        con.cerrarConexion();
    return resultado;
    }
    
    public boolean modificarEditorial(editorialBean editorial) throws SQLException{
        resultado=false;
        sql="UPDATE editorial SET editorial_nombre='"+editorial.getNombre()+"',editorial_descripcion='"+editorial.getDescripcion()+"' WHERE editorial_id="+editorial.getId()+"";
        con = new Conexion();
        resultado=con.setQuery(sql);
        con.cerrarConexion();
        return resultado;
    }
    
    public boolean eliminarEditorial(int id) throws SQLException{
       resultado=false;
        sql="delete from editorial where editorial_id="+id;
        con=new Conexion();
        resultado= con.setQuery(sql);
        return resultado;
    }
    
    
}
