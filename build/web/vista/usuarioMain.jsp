<%-- 
    Document   : inicio
    Created on : 19-abr-2017, 1:17:23
    Author     : Jose
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%@page session="true" language="java" import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="usuarioBean" scope="session" class="sv.edu.sv.bean.usuarioBean"/>
<jsp:setProperty name="usuarioBean" property="*"/>


<!DOCTYPE html>
<html>
    <%-- header --%>
    <head>
        <jsp:include page="assent/header.jsp"/>
        <title>MANTENIMINETO USUARIOS</title>
    </head>
    <%-- /header --%>
    <body class="nav-md">
       
    <div class="container body">
      <div class="main_container">
          
         <jsp:include page="assent/menuAdmin.jsp"/>
    <div class="right_col" role="main" style="min-height: 335px;">
  
    <%-- CONTENIDO --%>

<div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Configuracion de Usuarios</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      
                        
                      
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" action="/biblioteca-2017v2/controladorUsuario" method="post">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="nombre">Nombre <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="text" name="nombre" id="" required="required"  class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="apellido">apellido <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" name="apellido" id="last-name"  required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="usuario">usuario <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" name="carnet" id="last-name"   required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="tipo">Tipo Usuario <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <select id="tipo" name="tipousuario" class="form-control" >
                               <sql:query var="q2" dataSource="jdbc/mysql" sql="SELECT * FROM tipousuario" /> 

                                <c:forEach var="tipo" items="${q2.rows}">
                                    <option value="<c:out value="${tipo.tipousuario_id}"/>"><c:out value="${tipo.tipousuario_nombre}"/></option>
                                </c:forEach>
                            </select>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"   for="password">Password <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                              <input type="password" name="password" id="last-name"   required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>  
                        
                        <input type="hidden" value="insertar" name="metodo"/>  
                        
                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                          <button type="submit" class="btn btn-success">Guardar</button>
                        </div>
                      </div>

                    </form>
                  </div>
                </div>
                
                
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Datos</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      
                      
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    
                    <table class="table table-bordered">
                      <thead>
                        <tr>
                          <th>#</th>
                          <th>Nombre</th>
                          <th>Apellido</th>
                          <th>Usuario</th>
                          <th>Password</th>
                          <th>Tipo Usuario</th>
                          <th>Opciones</th>
                        </tr>
                      </thead>
                      <tbody>
                         <sql:query var="q1" dataSource="jdbc/mysql" sql="SELECT * FROM usuario inner join tipousuario on tipousuario.tipousuario_id=usuario.id_tipousuario" /> 

                        <c:forEach var="u" items="${q1.rows}">
                        <tr>
                            <td><c:out value="${u.usuario_id}"/></td>
                            <td><c:out value="${u.usuario_nombre}"/></td>
                            <td><c:out value="${u.usuario_apellido}"/></td>
                            <td><c:out value="${u.usuario_carnet}"/></td>
                            <td><c:out value="${u.usuario_password}"/></td>
                            <td><c:out value="${u.tipousuario_nombre}"/></td>
                            <td><a type="button" class="btn btn-info">Modificar</a><a href="/biblioteca-2017v2/controladorUsuario?metodo=eliminar&id=${u.usuario_id}" type="button" class="btn btn-danger">Eliminar</a></td>
                        </tr>
                        </c:forEach>

                      </tbody>
                    </table>
                  </div>
                </div>
              </div>


    <%-- /CONTENIDO --%>
          
        </div>
             <!-- footer content -->
    <footer>
          <div class="pull-right">
            BIBLIOTECA UDB 2017 DAVID IBARRA
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
    </body>
      </div>
    <%-- footer --%>
    <footer>
    <jsp:include page="assent/footer.jsp"/> 
    </footer>
    <%-- /footer --%>
</html>
