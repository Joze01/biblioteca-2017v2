<%-- 
    Document   : inicio
    Created on : 19-abr-2017, 1:17:23
    Author     : POO1
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



<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <%-- header --%>
    <head>
        <jsp:include page="assent/header.jsp"/>
        <title>DEVOLUCIONES</title>
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
                    <h2>Busqueda de materiales</h2>
                    <ul class="nav navbar-right panel_toolbox">

                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form class="form-horizontal form-label-left " action="" method="get">
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">CARNET </label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" name="busqueda" id="autocomplete-custom-append" class="form-control col-md-10"/>
                        </div>
                      </div>
                        <br>

                        
                        
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
                      <c:if test = "${buscador_b.getBusqueda()==null}" >
                          <sql:query var="q3" dataSource="jdbc/mysql" sql="select * from prestamo Inner join material on material.material_id = prestamo.id_material inner join usuario on usuario.usuario_id = prestamo.id_usuario inner join tipomaterial on tipomaterial.TipoMaterial_id=material.id_TipoMaterial and estado=1" /> 
                      </c:if> 
                    
                      <c:if test = "${buscador_b.getBusqueda()!=null}" >
                          <sql:query var="q3" dataSource="jdbc/mysql" sql="select * from prestamo Inner join material on material.material_id = prestamo.id_material inner join usuario on usuario.usuario_id = prestamo.id_usuario inner join tipomaterial on tipomaterial.TipoMaterial_id=material.id_TipoMaterial where estado=1 and usuario.usuario_carnet='${buscador_b.getBusqueda()}'" /> 
                      </c:if>
                    
                    

                
                    <display:table  id="prestamo"  htmlId="datatable-responsive" class="table table-striped" pagesize="10" name="${q3.rows}" export="true" >
                       <display:column title="#" property="prestamo_id" sortable="true"/>
                        <display:column title="ISBN" property="material_isbn" sortable="true"/>
                        <display:column title="Nombre" property="material_nombre" sortable="true"/>
                        <display:column title="Descripcion" property="material_descripcion" sortable="true"/>
                        <display:column title="Tipo de material" property="TipoMaterial_nombre" sortable="true"/>
                        <display:column title="Usuario" property="usuario_carnet" sortable="true" />
                        <display:column title="Estado" property="estado" sortable="true" />
                        <display:column title="Opciones">
                              <a type="button" href="/biblioteca-2017v2/controladorDevoluciones?id=${prestamo.prestamo_id}&material=${prestamo.id_material}" class="btn btn-info">Devolucion</a>
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
