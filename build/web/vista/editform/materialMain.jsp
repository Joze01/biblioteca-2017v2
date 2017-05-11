
<%-- 
    Document   : inicio
    Created on : 19-abr-2017, 1:17:23
    Author     : Jose
--%>
--%>
<jsp:useBean id="material_b" scope="request" class="sv.edu.sv.bean.materialBean">
 <jsp:setProperty name="material_b" property="*"/>
</jsp:useBean>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@page session="true" language="java" import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:if test="${editorial_b.isEmpty()}" >
    <c:redirect url = "http://localhost:8080/biblioteca-2017v2/vista/materialMain.jsp">
        <c:param name="mensaje" value="Debes seleccionar un registro para modificar"></c:param>
        <c:param name="exito" value="2"></c:param>
    </c:redirect>
</c:if>   




<!DOCTYPE html>
<html>
    <%-- header --%>
    <head>
        <jsp:include page="../assent/header_1.jsp"/>
        <title>MANTENIMINETO MATERIAL</title>
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
                    <h2>Configuracion de Materiales</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      
                      
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                        <form class="form-horizontal form-label-left " method="post" action="/biblioteca-2017v2/controladorMaterial" >
      <div id="wizard" class="form_wizard wizard_horizontal">
       

                      <ul class="wizard_steps">
                        <li>
                          <a href="#step-1">
                            <span class="step_no">1</span>
                            <span class="step_descr">
                                              Paso 1<br />
                                              <small>Datos Generales</small>
                                          </span>
                          </a>
                        </li>
                        <li>
                          <a href="#step-2">
                            <span class="step_no">2</span>
                            <span class="step_descr">
                                              Paso 2<br />
                                              <small>seleccionar autor</small>
                                          </span>
                          </a>
                        </li>
                      </ul>
                      <div id="step-1">
                         
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="isbn">ISBN<span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input type="text" id="isbn" name="isbn" value="${material_b.getIsbn()}" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                          
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nombre"> Nombre <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input type="text" id="Nombre" name="nombre" value="${material_b.getNombre()}" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                          
                         <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="descripcion"> Descripcion <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input type="text" id="descripcion" name="descripcion" value="${material_b.getDescripcion()}" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                         
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="year"> Año <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input type="number" max="2017" min="100" id="anio" name="anio" value="${material_b.getAnio()}" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                          
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="edicion"> Edicion <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input type="number" max="1000" min="0" id="edicion" name="edicion" value="${material_b.getEdicion()}" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                            <input type="hidden" name="id" value="${material_b.getId()}" />  
                          <input type="hidden" name="metodo" value="modificar"/>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="editorial"> Editorial <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                            <select name="editorial" class="form-control">
                                    <sql:query var="q3" dataSource="jdbc/mysql" sql="SELECT * FROM editorial" /> 
                                    <c:forEach var="x" items="${q3.rows}">
                                    <option value="${x.editorial_id}"> <c:out value="${x.editorial_nombre}"/> </option>
                                    </c:forEach>
                            </select>
                            </div>
                          </div>
                               
                               
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="ejemplares"> Ejemplares <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input type="number" min="1" id="ejemplares" value="${material_b.getEjemplares()}" name="ejemplar" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div> 
                                    
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="pagina"> Paginas/Pistas <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input type="number" min="1" id="descripcion" name="paginas" value="${material_b.getPaginas()}" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div> 
                                    
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="tipomaterial"> TipoMaterial <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                            <select name="tipomaterial" class="form-control">
                                    <sql:query var="q1" dataSource="jdbc/mysql" sql="SELECT * FROM tipomaterial" /> 
                                    <c:forEach var="u" items="${q1.rows}">
                                    <option value="${u.TipoMaterial_id}"> <c:out value="${u.TipoMaterial_nombre}"/> </option>
                                    </c:forEach>
                            </select>
                            </div>
                          </div>

                      </div>
                      <div id="step-2">
                        <h2 class="StepTitle">Seleccionar Autor</h2>
                      <table id="datatable" class="table table-striped table-bordered">
                        <thead>
                          <tr>
                            <th>#</th>
                            <th>Autor</th>
                            <th>Descripcion</th>
                            <th>Seleccion</th>

                          </tr>
                        </thead>
                        <tbody>
                           <sql:query var="q2" dataSource="jdbc/mysql" sql="SELECT * FROM autor" /> 
                                    <c:forEach var="a" items="${q2.rows}">
                                        <tr>
                                            <td><c:out value="${a.autor_id}"/></td>
                                            <td><c:out value="${a.autor_nombre}"/></td>
                                            <td><c:out value="${a.autor_descripcion}"/></td>    
                                            <td>
                                            <label><input type="radio" name="autor" id="" value="<c:out value="${a.autor_id}"/>" > <c:out value="${u.autor_nombre}"/> </label>
                                            </td>
                                        </tr>
                                    </c:forEach>
                        </tbody>
                      </table>
                                    
                        
                                    <input class="btn btn-success" type="submit"/>
                        
                      </div>


                  
                    </div>
                    <!-- End SmartWizard Content -->
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
    <jsp:include page="../assent/footer_1.jsp"/> 
    </footer>
    <%-- /footer --%>
</html>
