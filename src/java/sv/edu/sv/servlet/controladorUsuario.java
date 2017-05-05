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
import javax.servlet.http.HttpSession;
import sv.edu.sv.bean.usuarioBean;
import sv.edu.udb.usuario;
/**
 *
 * @author Jose
 */
@WebServlet(name = "controladorUsuario", urlPatterns = {"/controladorUsuario"})
public class controladorUsuario extends HttpServlet {

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
             HttpSession session = request.getSession(true);
            /* TODO output your page here. You may use following sample code. */
            usuarioBean user = new usuarioBean();
            usuario usuarios = new usuario();
              int resultado =0;
              out.println("<h1> llegue al servlet</h1>");
              out.println("<h1>"+request.getParameter("metodo")+"</h1>");
            
            if(request.getParameter("metodo").equals("insertar")){
                    out.println("<h1> Entre al if</h1>");
            user.setNombre(request.getParameter("nombre"));
            user.setApellido(request.getParameter("apellido"));
            user.setCarnet(request.getParameter("carnet"));
            user.setTipousuario(Integer.parseInt(request.getParameter("tipousuario")));
            user.setPassword(request.getParameter("password"));
            resultado= usuarios.nuevoUsuario(user);
            out.println("<h1> resultado: "+resultado+"</h1>");
            
            if(resultado==1){
            response.sendRedirect("vista/usuarioMain.jsp?exito=1&mensaje=Insertado correctamente");
            }else if(resultado==0){
            response.sendRedirect("vista/usuarioMain.jsp?exito=0&mensaje=Error al Insertar");
            }else if(resultado==2){
            response.sendRedirect("vista/usuarioMain.jsp?exito=0&mensaje=Error al Insertar, Usuario ya esta en uso");
            }
            
            }else if(request.getParameter("metodo").equals("eliminar")){
                int id= Integer.parseInt(request.getParameter("id"));
                 if(usuarios.eliminarUsuario(id)){
                    response.sendRedirect("vista/usuarioMain.jsp?exito=1&mensaje=Eliminado Correctametne");
                    }else{
                    response.sendRedirect("vista/usuarioMain.jsp?exito=0&mensaje=Error al Eliminar");
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
            Logger.getLogger(controladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(controladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
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
