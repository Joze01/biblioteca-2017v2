/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.sql.*;
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
    
        public boolean nuevoPrestamo(){
            int prestamosDocentes;
            int prestamosAlumnos;
            sql="select * from configuracion where where estado=1";
            con.setRs(sql);
        
        
        return resultado;
        }
    
    
    
    
}
