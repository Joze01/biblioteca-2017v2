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
import sv.edu.sv.bean.tipoMaterialBean;
import sv.edu.udb.tipoMaterial;

/**
 *
 * @author Jose
 */
@WebServlet(name = "controladorTipoMateriales", urlPatterns = {"/controladorTipoMateriales"})
public class controladorTipoMateriales extends HttpServlet {

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
             tipoMaterialBean tipoMaterial_b = new tipoMaterialBean();
            tipoMaterial tipoMaterial = new tipoMaterial();
            boolean resultado=false;
            /*tipoMaterial.setDescripcion(request.getParameter("descripcion"));
            tipoMaterial.setNombre(request.getParameter("descripcion"));
            */
            String metodo = request.getParameter("metodo");
            
            if(metodo.equals("insertar")){
            tipoMaterial_b.setNombre(request.getParameter("nombre"));
            tipoMaterial_b.setDescripcion(request.getParameter("descripcion"));
            resultado=tipoMaterial.nuevoTipoMaterial(tipoMaterial_b);
                if(resultado){
                response.sendRedirect("vista/tipoMaterialMain.jsp?exito=1&mensaje=Insertado Correctamente");
                }else{
                response.sendRedirect("vista/tipoMaterialMain.jsp?exito=0&mensaje=Error al Insertar");
                } 
            }
            
            if(metodo.equals("modificar")){
                tipoMaterial_b.setId(Integer.parseInt(request.getParameter("id")));
                tipoMaterial_b.setNombre(request.getParameter("nombre"));
                tipoMaterial_b.setDescripcion(request.getParameter("descripcion"));
                resultado=tipoMaterial.modificarrTipoMaterial(tipoMaterial_b);
                    if(resultado){
                    response.sendRedirect("vista/tipoMaterialMain.jsp?exito=1&mensaje=Modificado Correctamente");
                    }else{
                    response.sendRedirect("vista/tipoMaterialMain.jsp?exito=0&mensaje=Erorr al Modificar Registro");
                    } 
            }
            
            if(metodo.equals("eliminar")){
                int id=Integer.parseInt(request.getParameter("id"));
                resultado=tipoMaterial.eliminarTipoMaterial(id);
                    if(resultado){
                    response.sendRedirect("vista/tipoMaterialMain.jsp?exito=1&mensaje=Eliminado Correctamente");
                    }else{
                    response.sendRedirect("vista/tipoMaterialMain.jsp?exito=0&mensaje=Error al Eliminar");
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
            Logger.getLogger(controladorTipoMateriales.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(controladorTipoMateriales.class.getName()).log(Level.SEVERE, null, ex);
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
