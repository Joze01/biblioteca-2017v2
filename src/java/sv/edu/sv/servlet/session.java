/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.sv.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sv.edu.sv.bean.usuarioBean;
import sv.edu.udb.login;

/**
 *
 * @author Jose
 */
@WebServlet(name = "session", urlPatterns = {"/session"})
public class session extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                    String usuario = request.getParameter("carnet");
          String password= request.getParameter("password");
          login inicio = new login();
         
          if(inicio.iniciarSession(usuario, password)){
              HttpSession sesion = request.getSession();
              usuarioBean usr = inicio.getDatos(usuario, password);
              sesion.setAttribute("usuario_id", usr.getId());
              sesion.setAttribute("usario_nombre", usr.getNombre());
              sesion.setAttribute("usario_apellido", usr.getApellido());
              sesion.setAttribute("usuario_carnet", usr.getCarnet());
              sesion.setAttribute("id_tipousuario", usr.getTipousuario());
              sesion.setAttribute("usuario_password", usr.getPassword());
              response.sendRedirect("/biblioteca-2017v2/vista/materialMain.jsp");
          } else{
          response.sendRedirect("/biblioteca-2017v2/vista/login.jsp");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
