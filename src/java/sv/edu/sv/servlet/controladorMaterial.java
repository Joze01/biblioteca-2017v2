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
import sv.edu.sv.bean.materialBean;
import sv.edu.udb.material;

/**
 *
 * @author Jose
 */
@WebServlet(name = "controladorMaterial", urlPatterns = {"/controladorMaterial"})
public class controladorMaterial extends HttpServlet {

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
            materialBean mat_b = new materialBean();
            material mat = new material();
            boolean resultado=false;
            
            String metodo = request.getParameter("metodo");
            
            
            out.println(metodo);
            
            if(metodo.equals("insertar")){
                
            out.println("IF");
                
                
            mat_b.setIsbn(request.getParameter("isbn"));
            mat_b.setNombre(request.getParameter("nombre"));
            mat_b.setDescripcion(request.getParameter("descripcion"));
            mat_b.setAutor(Integer.parseInt(request.getParameter("autor")));
            mat_b.setAnio(Integer.parseInt(request.getParameter("anio")));
            mat_b.setEdicion(Integer.parseInt(request.getParameter("edicion")));
            mat_b.setEditorial(Integer.parseInt(request.getParameter("editorial")));
            mat_b.setPaginas(request.getParameter("pagina"));
            mat_b.setTipo(Integer.parseInt(request.getParameter("tipomaterial")));
            mat_b.setEjemplares(Integer.parseInt(request.getParameter("ejemplar")));
            
            
            
            resultado=mat.nuevoMaterial(mat_b);
                if(resultado){
                response.sendRedirect("vista/materialMain.jsp?exito=1&mensaje=Insertado Correctamente");
                }else{
                response.sendRedirect("vista/materialMain.jsp?exito=0&mensaje=Error al Insertar");
                } 
            }
            
            if(metodo.equals("modificar")){
                mat_b.setId(Integer.parseInt(request.getParameter("id")));
                mat_b.setIsbn(request.getParameter("isbn"));
            mat_b.setNombre(request.getParameter("nombre"));
            mat_b.setDescripcion(request.getParameter("descripcion"));
            mat_b.setAutor(Integer.parseInt(request.getParameter("autor")));
            mat_b.setAnio(Integer.parseInt(request.getParameter("anio")));
            mat_b.setEdicion(Integer.parseInt(request.getParameter("edicion")));
            mat_b.setEditorial(Integer.parseInt(request.getParameter("editorial")));
            mat_b.setPaginas(request.getParameter("pagina"));
            mat_b.setTipo(Integer.parseInt(request.getParameter("tipo")));
            mat_b.setEjemplares(Integer.parseInt(request.getParameter("ejemplares")));
            
            resultado=mat.modificar(mat_b);
                    if(resultado){
                    response.sendRedirect("vista/materialMain.jsp?exito=1&mensaje=Modificado Correctamente");
                    }else{
                    response.sendRedirect("vista/materialMain.jsp?exito=0&mensaje=Erorr al Modificar Registro");
                    } 
            }
            
            if(metodo.equals("eliminar")){
                int id=Integer.parseInt(request.getParameter("id"));
                resultado=mat.eliminar(id);
                    if(resultado){
                    response.sendRedirect("vista/materialMain.jsp?exito=1&mensaje=Eliminado Correctamente");
                    }else{
                    response.sendRedirect("vista/materialMain.jsp?exito=0&mensaje=Error al Eliminar");
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
            Logger.getLogger(controladorMaterial.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(controladorMaterial.class.getName()).log(Level.SEVERE, null, ex);
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
