<%-- 
    Document   : inicio
    Created on : 19-abr-2017, 1:17:23
    Author     : Jose
--%>
<%@page session="true" language="java" import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
    <%-- header --%>
    <head>
        <jsp:include page="assent/header.jsp"/>
        <title>MANTENIMINETO TIPO MATERIALES</title>
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
                    <h2>Tipo de Materiles</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      
                      
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" action="/biblioteca-2017v2/controladorTipoMateriales" method="post">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nombre">Nombre <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="text" name="nombre" id="first-name" required="required"  class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="descripcion">Descripcion <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" name="descripcion" id="last-name"  required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                        <input type="hidden" name="metodo" value="insertar"/>
                      
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
                          <th>Descripcion</th>
                          <th>Opciones</th>
                        </tr>
                      </thead>
                      <tbody>
                        <sql:query var="q1" dataSource="jdbc/mysql" sql="SELECT * FROM tipomaterial" /> 

                        <c:forEach var="u" items="${q1.rows}">
                        <tr>
                            <td><c:out value="${u.TipoMaterial_id}"/></td>
                            <td><c:out value="${u.TipoMaterial_nombre}"/></td>
                            <td><c:out value="${u.TipoMaterial_descripcion}"/></td>
                            <td><a type="button" class="btn btn-info">Modificar</a>
                                <a href="/biblioteca-2017v2/controladorTipoMateriales?metodo=eliminar&id=${u.TipoMaterial_id}" type="button" class="btn btn-danger">Eliminar</a></td>
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
