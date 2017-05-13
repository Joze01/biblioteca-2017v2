<%-- 
    Document   : inicio
    Created on : 19-abr-2017, 1:17:23
    Author     : David
--%>
<jsp:useBean id="buscador_b" scope="request" class="sv.edu.sv.bean.buscadorBean">
 <jsp:setProperty name="buscador_b" property="*"/>
</jsp:useBean>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@page session="true" language="java" import="java.util.*" %>
<%
HttpSession sesion = request.getSession();
String usuarioss;
Integer tiposs;
if (sesion.getAttribute("usuario_id")==null) {
    //response.sendRedirect("login.jsp?exito=2&mensaje=Debes iniciar sesion");

} else {
   tiposs=(Integer)sesion.getAttribute("id_tipousuario");
   usuarioss=(String)sesion.getAttribute("usario_nombre");

}

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <%-- header --%>
    <head>
        <jsp:include page="assent/header.jsp"/>
        <title>BUSCADOR</title>
    </head>
    <%-- /header --%>
    <body class="nav-md">
       
    <div class="container body">
      <div class="main_container">
          <%
             if( (null!=sesion)){
             if((sesion.getAttribute("id_tipousuario")!=null) && ((Integer)sesion.getAttribute("id_tipousuario")==1) ){
                 
          %>
         <jsp:include page="assent/menuAdmin.jsp"/>
         <%
             }else{
         %>
         <jsp:include page="assent/menuUsuario.jsp"/>
         <%
             }
}
         %>
         
    <div class="right_col" role="main" style="min-height: 335px;">
  
    <%-- CONTENIDO --%>
     
<div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Busqueda de materiales</h2>
                    <ul class="nav navbar-right panel_toolbox">

                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form class="form-horizontal form-label-left " action="" method="get">
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Buscar: </label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" name="busqueda" id="autocomplete-custom-append" class="form-control col-md-10"/>
                        </div>
                      </div>
                        <br>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Parametro</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select name="parametro" class="form-control">
                              <option value="1">Titulo</option>
                              <option value="2">Autor</option>
                          </select>
                        </div>
                      </div>  
                        
                        <button type="submit" class="btn btn-success"> BUSCAR </button>
                        
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
                      <c:if test = "${buscador_b.getParametro()=='1'}" >
                          <sql:query var="q3" dataSource="jdbc/mysql" sql="select * from material inner join autor on autor.autor_id=material.id_autor inner join editorial on material.id_editorial = editorial.editorial_id inner join tipomaterial on material.id_TipoMaterial = tipomaterial.TipoMaterial_id where material.material_nombre='${buscador_b.getBusqueda()}'" /> 
                      </c:if>
                  
                     <c:if test = "${buscador_b.getParametro()=='2'}" >
                          <sql:query var="q3" dataSource="jdbc/mysql" sql="select * from material inner join autor on autor.autor_id=material.id_autor inner join editorial on material.id_editorial = editorial.editorial_id inner join tipomaterial on material.id_TipoMaterial = tipomaterial.TipoMaterial_id where autor.autor_nombre='${buscador_b.getBusqueda()}'" /> 
                      </c:if>
                
                    <display:table  id="material"  htmlId="datatable-responsive" class="table table-striped" pagesize="10" name="${q3.rows}" export="true" >
                       <display:column title="#" property="material_id" sortable="true"/>
                        <display:column title="ISBN" property="material_isbn" sortable="true"/>
                        <display:column title="Nombre" property="material_nombre" sortable="true"/>
                        <display:column title="Descripcion" property="material_descripcion" sortable="true"/>
                        <display:column title="Autor" property="autor_nombre" sortable="true"/>
                        <display:column title="Año" property="material_anio" sortable="true"/>
                        <display:column title="Ejemplares" property="ejemplares" sortable="true"/>
                        <display:column title="Edicion" property="material_edicion" sortable="true"/>
                        <display:column title="Editorial" property="editorial_nombre" sortable="true"/>
                        <display:column title="# Paginas/Tracks" property="material_paginas" sortable="true"/>
                        <display:column title="Tipo de material" property="TipoMaterial_nombre" sortable="true"/>
                        <display:column title="Opciones">
                                     <a type="button" href="/biblioteca-2017v2/controladorPrestamo?tipo=<%= sesion.getAttribute("id_tipousuario") %>&material=${material.material_id}&usuario=<%= sesion.getAttribute("usuario_id") %>" class="btn btn-info">Prestar</a>          
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
