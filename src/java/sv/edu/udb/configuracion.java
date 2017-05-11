/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.sql.ResultSet;
import java.sql.SQLException;
import sv.edu.sv.bean.configuracionBean;

/**
 *
 * @author Jose
 */
public class configuracion {
        Conexion con;
        String sql;
        ResultSet rs;
        boolean resultado=false;
    public boolean nuevaConfiguracion(configuracionBean config) throws SQLException{
        resultado=false;
        if(config.isEstado()){
        con=new Conexion();
        sql="UPDATE configuracion SET estado=0";
        resultado=con.setQuery(sql);
        sql="INSERT INTO configuracion(configuracion_alumno, configuracion_docente, configuracion_mora, estado) VALUES ("+config.getAlumno()+","+config.getDocente()+","+config.getMora()+",1)";
        resultado=con.setQuery(sql);
        con.cerrarConexion();
        }else{
        con=new Conexion();
        sql="INSERT INTO configuracion(configuracion_alumno, configuracion_docente, configuracion_mora, estado) VALUES ("+config.getAlumno()+","+config.getDocente()+","+config.getMora()+",0)";
        resultado=con.setQuery(sql);
        con.cerrarConexion();
        }
        
        
        return resultado;
    }
    
    public boolean modificarConfiguracion(configuracionBean config) throws SQLException{
        resultado=false;
        int valorestado=0;
        if(config.isEstado()){
        valorestado=1;
        }
        
        sql="UPDATE configuracion SET configuracion_alumno="+config.getAlumno()+",configuracion_docente="+config.getDocente()+",configuracion_mora="+config.getMora()+", estado="+valorestado+" where configuracion_id= "+config.getId();
        con = new Conexion();
        resultado=con.setQuery(sql);
        con.cerrarConexion();
        return resultado;
    }
    
    public boolean eliminarConfiguracion(int id) throws SQLException{
       resultado=false;
        sql="DELETE FROM configuracion WHERE configuracion_id="+id;
        con=new Conexion();
        resultado= con.setQuery(sql);
        return resultado;
    }


}
