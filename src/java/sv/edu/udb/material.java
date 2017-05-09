/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;
import sv.edu.sv.bean.materialBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jose
 */
public class material {
    Conexion con;
        String sql;
        ResultSet rs;
        boolean resultado=false;
        
        public boolean nuevoMaterial(materialBean mat) throws SQLException{
        sql="INSERT INTO material"
                + "(material_isbn, material_nombre, material_descripcion, id_autor, "
                + "material_anio, material_edicion, id_editorial, material_paginas, "
                + "id_TipoMaterial, ejemplares) VALUES "
                + "('"+mat.getIsbn()+"',"
                + "'"+mat.getNombre()+"',"
                + "'"+mat.getDescripcion()+"',"
                + ""+mat.getAutor()+","
                + ""+mat.getAnio()+","
                + ""+mat.getEdicion()+","
                + ""+mat.getEditorial()+","
                + "'"+mat.getPaginas()+"',"+mat.getTipo()+","+mat.getEjemplares()+")";
        con = new Conexion();
        resultado=con.setQuery(sql);
        con.cerrarConexion();
        return resultado;
        }
        
        public boolean modificar(materialBean mat) throws SQLException{
        sql="UPDATE material SET "
                + "material_isbn='"+mat.getIsbn()+"',"
                + "material_nombre='"+mat.getNombre()+"',"
                + "material_descripcion='"+mat.getDescripcion()+"',"
                + "id_autor="+mat.getAutor()+","
                + "material_anio="+mat.getAnio()+","
                + "material_edicion=="+mat.getEdicion()+","
                + "id_editorial="+mat.getEditorial()+","
                + "material_paginas='"+mat.getPaginas()+"',"
                + "id_TipoMaterial="+mat.getTipo()+","
                + "ejemplares=[value-12] WHERE material_id="+mat.getId();
        con = new Conexion();
        resultado = con.setQuery(sql);
        return resultado;
        }
        
        public boolean eliminar(int id) throws SQLException{
        sql="DELETE FROM material WHERE material_id="+id;
        con = new Conexion();
        con.setQuery(sql);
        return resultado;
        }
        
        
        
}
