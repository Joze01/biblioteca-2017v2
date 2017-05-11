/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.sv.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sv.edu.sv.bean.autorBean;
import sv.edu.sv.bean.configuracionBean;
import sv.edu.udb.configuracion;
/**
 *
 * @author Jose
 */
@WebServlet(name = "controladorConfiguracion", urlPatterns = {"/controladorConfiguracion"})
public class controladorConfiguracion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            configuracionBean config = new configuracionBean();
            configuracion confiS = new configuracion();
            boolean resultado=false;
            String metodo = request.getParameter("metodo");
            
            
            if(metodo.equals("insertar")){
               /*out.println(request.getParameter("alumno")+"    "+request.getParameter("docente")+"     "+request.getParameter("mora")+"  "+request.getParameter("estado"));
               */
               config.setAlumno(Integer.parseInt(request.getParameter("alumno")));
               config.setDocente(Integer.parseInt(request.getParameter("docente")));
               config.setMora(Double.parseDouble(request.getParameter("mora")));
               config.setEstado(Boolean.parseBoolean(request.getParameter("estado")));
               resultado=confiS.nuevaConfiguracion(config);
               if(resultado){
                response.sendRedirect("vista/configuracionMain.jsp?exito=1&mensaje=Insertado Correctamente");
                }else{
                response.sendRedirect("vista/configuracionMain.jsp?exito=0&mensaje=Error al Insertar");
                }
            }
            
            if(metodo.equals("modificar")){
               config.setId(Integer.parseInt(request.getParameter("id")));
                config.setAlumno(Integer.parseInt(request.getParameter("alumno")));
               config.setDocente(Integer.parseInt(request.getParameter("docente")));
               config.setMora(Double.parseDouble(request.getParameter("mora")));
               config.setEstado(Boolean.parseBoolean(request.getParameter("estado")));
               resultado=confiS.modificarConfiguracion(config);
               if(resultado){
                response.sendRedirect("vista/configuracionMain.jsp?exito=1&mensaje=Modificado Correctamente");
                }else{
                response.sendRedirect("vista/configuracionMain.jsp?exito=0&mensaje=Error al Modificar");
                }
            }
            
            if(metodo.equals("eliminar")){
               int id = Integer.parseInt(request.getParameter("id"));
               resultado=confiS.eliminarConfiguracion(id);
               if(resultado){
                response.sendRedirect("vista/configuracionMain.jsp?exito=1&mensaje=Eliminado correctamente");
                }else{
                response.sendRedirect("vista/configuracionMain.jsp?exito=0&mensaje=Error al eliminar");
                }
              
            }
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(controladorConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(controladorConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
