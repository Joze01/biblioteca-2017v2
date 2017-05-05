/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.sql.ResultSet;
import java.sql.SQLException;
import sv.edu.sv.bean.tipoMaterialBean;
/**
 *
 * @author Jose
 */
public class tipoMaterial {
    Conexion con;
        String sql;
        ResultSet rs;
        boolean resultado=false;
        
        public boolean nuevoTipoMaterial(tipoMaterialBean tipoMaterial) throws SQLException{
        resultado=false;
          sql="INSERT INTO tipomaterial (TipoMaterial_nombre, TipoMaterial_descripcion) VALUES ('"+tipoMaterial.getNombre()+"','"+tipoMaterial.getDescripcion()+"')" ; 
          con = new Conexion();
          resultado=con.setQuery(sql);
          con.cerrarConexion();
          
          return resultado;
        }
        
        public boolean modificarrTipoMaterial(tipoMaterialBean tipoMaterial) throws SQLException{
          resultado=false;
          sql="UPDATE tipomaterial SET TipoMaterial_nombre='"+tipoMaterial.getNombre()+"',TipoMaterial_descripcion='"+tipoMaterial.getDescripcion()+"' WHERE TipoMaterial_id="+tipoMaterial.getId();
          con = new Conexion();
          resultado=con.setQuery(sql);
          con.cerrarConexion();
          
          return resultado;
        }
        
        public boolean eliminarTipoMaterial(int id) throws SQLException{
          resultado=false;
          sql="DELETE FROM tipomaterial WHERE TipoMaterial_id="+id;
          con = new Conexion();
          resultado=con.setQuery(sql);
          con.cerrarConexion();
          
          return resultado;
        }
        
        
        
        
}
