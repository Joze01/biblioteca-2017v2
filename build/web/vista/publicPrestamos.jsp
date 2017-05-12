<%-- 
    Document   : inicio
    Created on : 19-abr-2017, 1:17:23
    Author     : Jose
--%>


<jsp:useBean id="usuario_b" scope="request" class="sv.edu.sv.bean.usuarioBean">
 <jsp:setProperty name="usuario_b" property="*"/>
</jsp:useBean>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@page session="true" language="java" import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
                    <h2>Seleccionar Usuario</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      
                      
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    
                          <sql:query var="q1" dataSource="jdbc/mysql" sql="SELECT * FROM usuario inner join tipousuario on tipousuario.tipousuario_id=usuario.id_tipousuario" /> 

                    <display:table  id="usuario" htmlId="datatable" class="table table-striped table-bordered" pagesize="10" name="${q1.rows}" export="true" >
                        <display:column title="Codigo" property="usuario_id" sortable="true"/>
                        <display:column title="Nombre" property="usuario_nombre" sortable="true"/>
                        <display:column title="Apellido" property="usuario_apellido" sortable="true"/>
                        <display:column title="Carnet" property="usuario_carnet" sortable="true"/>
                        <display:column title="Tipo Usuario" property="tipousuario_nombre" sortable="true"/>
                        <display:column title="Password" property="usuario_password" sortable="true"/>
                        <display:column title="Funciones">
                            <a type="button" href="/controladorPrestamo" class="btn btn-info">Seleccionar</a>
                         
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
