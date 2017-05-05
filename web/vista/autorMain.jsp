<%-- 
    Document   : inicio
    Created on : 19-abr-2017, 1:17:23
    Author     : Jose
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <%-- header --%>
    <head>
        <jsp:include page="assent/header.jsp"/>
        <title>MANTENIMINETO AUTORES</title>
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
                    <h2>Configuracion Autores</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      
                      
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" action="/biblioteca-2017v2/controladorAutor" method="post">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nombre">Nombre <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="text" name="nombre" id="nombre" required="required"  class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="descripcion">Descripcion <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" name="descripcion" id="descripcion" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                            
                        <input type="hidden" name="metodo" value="insertar">
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
                    <sql:query var="q1" dataSource="jdbc/mysql" sql="SELECT * FROM autor" /> 
                        
                    <display:table  id="autor" htmlId="datatable" class="table table-striped table-bordered" pagesize="3" name="${q1.rows}" export="true" >
                        <display:column title="Codigo" property="autor_id" sortable="true"/>
                        <display:column title="Nombre" property="autor_nombre" sortable="true"/>
                        <display:column title="Descripcion" property="autor_descripcion" sortable="true"/>
                        <display:column title="Funciones">
                                     <a type="button" class="btn btn-info">Modificar</a>
                                     <a href="/biblioteca-2017v2/controladorAutor?metodo=eliminar&id=<c:out value="${autor.autor_id}"/>" type="button" class="btn btn-danger">Eliminar</a>
                        </display:column>
                   </display:table>
                       
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
