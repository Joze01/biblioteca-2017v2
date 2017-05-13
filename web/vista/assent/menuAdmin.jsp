<%-- 
    Document   : menu
    Created on : 19-abr-2017, 1:27:17
    Author     : Jose
--%>
<%
HttpSession sesion = request.getSession();

%>
<div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-book"></i> <span>Biblioteca UDB</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_info">
                <span></span>
                <h2><%= sesion.getAttribute("usario_nombre") %></h2>
              </div>
            </div>
            <!-- /menu profile quick info -->
            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>Biblioteca</h3>
                <ul class="nav side-menu">
                    <li><a href="publicBusqueda.jsp"><i class="fa fa-search"></i> Prestamos <span class="fa fa-search"></span></a></li>
                    <li><a href="publicPrestamos.jsp"><i class="fa fa-check-square"></i> Mis Prestamos <span class="fa fa-check"></span></a></li>

                </ul>
              </div>
              <div class="menu_section">
                <h3>Administracion</h3>
                <ul class="nav side-menu">
                    <li><a href="publicPrestamos.jsp"><i class="fa fa-book"></i> Devoluciones <span class="fa fa-book"></span></a></li>
                    <li><a href="usuarioMain.jsp"><i class="fa fa-user"></i> Usuarios <span class="fa fa-user"></span></a></li>    
                    <li><a href="configuracionMain.jsp"><i class="fa fa-cog"></i> Sistema <span class="fa fa-cog"></span></a></li>
                    <li><a><i class="fa fa-list"></i> Biblioteca <span class="fa fa-list"></span></a>
                        <ul class="nav child_menu">
                        <li><a href="editorialMain.jsp">Editoriales</a></li>
                        <li><a href="autorMain.jsp">Autores</a></li>
                        <li><a href="tipoMaterialMain.jsp">Tipo Materiales</a></li>
                        <li><a href="materialMain.jsp">Materiales</a></li>
                    </ul>
                    </li>
                    <li><a><i class="fa fa-file-pdf-o"></i> Reportes <span class="fa fa-file-pdf-o"></span></a></li>
                    
                </ul>
              </div>

            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.jsp">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>



        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                

              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->