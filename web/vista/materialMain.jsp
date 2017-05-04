
<%-- 
    Document   : inicio
    Created on : 19-abr-2017, 1:17:23
    Author     : Jose
--%>
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page session="true" language="java" import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" language="java" import="java.util.*" %>

<!DOCTYPE html>
<html>
    <%-- header --%>
    <head>
        <jsp:include page="assent/header.jsp"/>
        <title>MANTENIMINETO MATERIAL</title>
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
                    <h2>Configuracion de Materiales</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      
                      
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                        <form class="form-horizontal form-label-left " method="get" action="hola" >
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
                              <input type="text" id="isbn" name="isbn" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                          
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nombre"> Nombre <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input type="text" id="Nombre" name="nombre" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                          
                         <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="descripcion"> Descripcion <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input type="text" id="descripcion" name="descripcion" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                         
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="year"> Año <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input type="number" max="2017" min="100" id="descripcion" name="anio" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                          
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="edicion"> Edicion <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input type="number" max="1000" min="0" id="edicion" name="edicion" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                        
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="editorial"> Editorial <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                            <select name="editorial" class="form-control">
                                    <sql:query var="q1" dataSource="jdbc/mysql" sql="SELECT * FROM editorial" /> 
                                    <c:forEach var="u" items="${q1.rows}">
                                    <option value="${u.editorial_id}"> <c:out value="${u.editorial_nombre}"/> </option>
                                    </c:forEach>
                            </select>
                            </div>
                          </div>
                                    
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="pagina"> Paginas/Pistas <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input type="number" min="1" id="descripcion" name="pagina" required="required" class="form-control col-md-7 col-xs-12">
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
                           <sql:query var="q1" dataSource="jdbc/mysql" sql="SELECT * FROM autor" /> 
                                    <c:forEach var="u" items="${q1.rows}">
                                        <tr>
                                            <td><c:out value="${u.autor_id}"/></td>
                                            <td><c:out value="${u.autor_nombre}"/></td>
                                            <td><c:out value="${u.autor_descripcion}"/></td>    
                                            <td>
                                            <label><input type="radio" name="autor" id="" value="<c:out value="${u.autor_id}"/>" > <c:out value="${u.autor_nombre}"/> </label>
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
