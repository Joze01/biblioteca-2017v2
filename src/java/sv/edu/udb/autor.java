/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.sql.ResultSet;
import java.sql.SQLException;
import sv.edu.sv.bean.autorBean;

/**
 *
 * @author Jose
 */
public class autor {
        Conexion con;
        String sql;
        ResultSet rs;
        boolean resultado=false;
    public boolean nuevaAutor(autorBean autor) throws SQLException{
        resultado=false;
        sql="INSERT INTO autor(autor_nombre, autor_descripcion) VALUES ('"+autor.getNombre()+"','"+autor.getDescripcion()+"')";
        con=new Conexion();
        resultado=con.setQuery(sql);
        con.cerrarConexion();
        return resultado;
    }
    
    public boolean modificarAutor(autorBean autor) throws SQLException{
        resultado=false;
        sql="UPDATE autor SET autor_nombre='"+autor.getNombre()+"',autor_descripcion='"+autor.getDescripcion()+"' WHERE autor_id="+autor.getId();
        con = new Conexion();
        con.setQuery(sql);
        con.cerrarConexion();
        return resultado;
    }
    
    public boolean eliminarAutor(int id) throws SQLException{
       resultado=false;
        sql="DELETE FROM autor WHERE autor_id="+id;
        con=new Conexion();
        resultado= con.setQuery(sql);
        return resultado;
    }


}
