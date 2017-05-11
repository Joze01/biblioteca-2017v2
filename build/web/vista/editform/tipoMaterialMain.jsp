<%-- 
    Document   : inicio
    Created on : 19-abr-2017, 1:17:23
    Author     : Jose
--%>
<jsp:useBean id="tipoMaterialBean_b" scope="request" class="sv.edu.sv.bean.tipoMaterialBean">
 <jsp:setProperty name="tipoMaterialBean_b" property="*"/>
</jsp:useBean>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@page session="true" language="java" import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:if test="${tipoMaterialBean_b.isEmpty()}" >
    <c:redirect url = "http://localhost:8080/biblioteca-2017v2/vista/tipoMaterialMain.jsp">
        <c:param name="mensaje" value="Debes seleccionar un registro para modificar"></c:param>
        <c:param name="exito" value="2"></c:param>
    </c:redirect>
</c:if> 

<!DOCTYPE html>
<html>
    <%-- header --%>
    <head>
        <jsp:include page="../assent/header_1.jsp"/>
        <title>MANTENIMINETO TIPO MATERIALES</title>
    </head>
    <%-- /header --%>
    <body class="nav-md">
       
    <div class="container body">
      <div class="main_container">
          
         <jsp:include page="../assent/menuAdmin.jsp"/>
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
                            <input type="text" name="nombre" id="first-name" value="${tipoMaterialBean_b.getNombre()}" required="required"  class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="descripcion">Descripcion <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" name="descripcion" value="${tipoMaterialBean_b.getDescripcion()}" id="last-name"  required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                        <input type="hidden" name="metodo" value="modificar"/>
                        <input type="hidden" name="id" value="${tipoMaterialBean_b.getId()}"/>
                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                          <button type="submit" class="btn btn-success">Modificar</button>
                        </div>
                      </div>

                    </form>
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
    <jsp:include page="../assent/footer.jsp"/> 
    </footer>
    <%-- /footer --%>
</html>
