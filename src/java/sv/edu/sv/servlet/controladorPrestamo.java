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
import sv.edu.sv.bean.prestamoBean;
import sv.edu.udb.prestamo;

/**
 *
 * @author Jose
 */
@WebServlet(name = "controladorPrestamo", urlPatterns = {"/controladorPrestamo"})
public class controladorPrestamo extends HttpServlet {

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
            
            prestamoBean prestamo_b = new prestamoBean();
            prestamo presta = new prestamo();
            boolean resultado=false;
            /* TODO output your page here. You may use following sample code. */
           HttpSession sesion = request.getSession();
           if(sesion.getAttribute("usuario_id")==null){
               response.sendRedirect("/biblioteca-2017v2/vista/login.jsp?exito=2&mensaje=Debes iniciar sesion");
           }else{
            prestamo_b.setMaterial(Integer.parseInt(request.getParameter("material")));
            prestamo_b.setUsuario(Integer.parseInt(request.getParameter("usuario")));
            prestamo_b.setTipo(Integer.parseInt(request.getParameter("tipo")));
            out.print("<h1> Aviso </h1>");
            resultado=presta.nuevoPrestamo(prestamo_b);
             
            if(resultado){
            response.sendRedirect("/biblioteca-2017v2/vista/publicBusqueda.jsp?exito=1&mensaje=Prestamo Registrado");
            }else{
            response.sendRedirect("/biblioteca-2017v2/vista/publicBusqueda.jsp?exito=2&mensaje=No se ha registrado el Prestamo, Presentas mora o maximo de prestamos alcanzados");
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
