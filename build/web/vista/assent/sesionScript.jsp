<%-- 
    Document   : sesionScript
    Created on : 11-may-2017, 22:26:14
    Author     : Jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
HttpSession sesion = request.getSession();

if (session.isNew()) {
     response.sendRedirect("login.jsp");

} else {
    out.println("<h1>"+sesion.getAttribute("+usuario_nombre+")+"</h1>");
   
}






%>
