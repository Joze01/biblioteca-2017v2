package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class materialMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_sortable_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_table_pagesize_name_id_htmlId_export_class;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_sql_dataSource_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_sortable_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_table_pagesize_name_id_htmlId_export_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_sql_dataSource_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_display_column_title_sortable_property_nobody.release();
    _jspx_tagPool_display_column_title.release();
    _jspx_tagPool_display_table_pagesize_name_id_htmlId_export_class.release();
    _jspx_tagPool_sql_query_var_sql_dataSource_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("--%>\n");
      sv.edu.sv.bean.materialBean material_b = null;
      synchronized (request) {
        material_b = (sv.edu.sv.bean.materialBean) _jspx_page_context.getAttribute("material_b", PageContext.REQUEST_SCOPE);
        if (material_b == null){
          material_b = new sv.edu.sv.bean.materialBean();
          _jspx_page_context.setAttribute("material_b", material_b, PageContext.REQUEST_SCOPE);
          out.write('\n');
          out.write(' ');
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("material_b"), request);
          out.write('\n');
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "assent/header.jsp", out, false);
      out.write("\n");
      out.write("        <title>MANTENIMINETO MATERIAL</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <body class=\"nav-md\">\n");
      out.write("       \n");
      out.write("    <div class=\"container body\">\n");
      out.write("      <div class=\"main_container\">\n");
      out.write("          \n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "assent/menuAdmin.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"right_col\" role=\"main\" style=\"min-height: 335px;\">\n");
      out.write("  \n");
      out.write("    ");
      out.write("\n");
      out.write("     \n");
      out.write("<div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"x_panel\">\n");
      out.write("                  <div class=\"x_title\">\n");
      out.write("                    <h2>Configuracion de Materiales</h2>\n");
      out.write("                    <ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"x_content\">\n");
      out.write("                    <br />\n");
      out.write("                        <form class=\"form-horizontal form-label-left \" method=\"post\" action=\"/biblioteca-2017v2/controladorMaterial\" >\n");
      out.write("      <div id=\"wizard\" class=\"form_wizard wizard_horizontal\">\n");
      out.write("       \n");
      out.write("\n");
      out.write("                      <ul class=\"wizard_steps\">\n");
      out.write("                        <li>\n");
      out.write("                          <a href=\"#step-1\">\n");
      out.write("                            <span class=\"step_no\">1</span>\n");
      out.write("                            <span class=\"step_descr\">\n");
      out.write("                                              Paso 1<br />\n");
      out.write("                                              <small>Datos Generales</small>\n");
      out.write("                                          </span>\n");
      out.write("                          </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                          <a href=\"#step-2\">\n");
      out.write("                            <span class=\"step_no\">2</span>\n");
      out.write("                            <span class=\"step_descr\">\n");
      out.write("                                              Paso 2<br />\n");
      out.write("                                              <small>seleccionar autor</small>\n");
      out.write("                                          </span>\n");
      out.write("                          </a>\n");
      out.write("                        </li>\n");
      out.write("                      </ul>\n");
      out.write("                      <div id=\"step-1\">\n");
      out.write("                         \n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"isbn\">ISBN<span class=\"required\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                              <input type=\"text\" id=\"isbn\" name=\"isbn\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                          \n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"nombre\"> Nombre <span class=\"required\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                              <input type=\"text\" id=\"Nombre\" name=\"nombre\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                          \n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"descripcion\"> Descripcion <span class=\"required\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                              <input type=\"text\" id=\"descripcion\" name=\"descripcion\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                         \n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"year\"> Año <span class=\"required\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                              <input type=\"number\" max=\"2017\" min=\"100\" id=\"anio\" name=\"anio\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                          \n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"edicion\"> Edicion <span class=\"required\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                              <input type=\"number\" max=\"1000\" min=\"0\" id=\"edicion\" name=\"edicion\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                          <input type=\"hidden\" name=\"metodo\" value=\"insertar\"/>\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"editorial\"> Editorial <span class=\"required\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                            <select name=\"editorial\" class=\"form-control\">\n");
      out.write("                                    ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"ejemplar\"> Ejemplares <span class=\"required\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                              <input type=\"number\" min=\"1\" id=\"ejemplar\" name=\"ejemplar\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                            </div>\n");
      out.write("                          </div> \n");
      out.write("                                    \n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"paginas\"> Paginas/Pistas <span class=\"required\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                              <input type=\"number\" min=\"1\" id=\"descripcion\" name=\"paginas\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                            </div>\n");
      out.write("                          </div> \n");
      out.write("                                    \n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"tipomaterial\"> TipoMaterial <span class=\"required\">*</span>\n");
      out.write("                            </label>\n");
      out.write("                            <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                            <select name=\"tipomaterial\" class=\"form-control\">\n");
      out.write("                                    ");
      if (_jspx_meth_sql_query_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("\n");
      out.write("                      </div>\n");
      out.write("                      <div id=\"step-2\">\n");
      out.write("                        <h2 class=\"StepTitle\">Seleccionar Autor</h2>\n");
      out.write("                      <table id=\"datatable\" class=\"table table-striped table-bordered\">\n");
      out.write("                        <thead>\n");
      out.write("                          <tr>\n");
      out.write("                            <th>#</th>\n");
      out.write("                            <th>Autor</th>\n");
      out.write("                            <th>Descripcion</th>\n");
      out.write("                            <th>Seleccion</th>\n");
      out.write("\n");
      out.write("                          </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                           ");
      if (_jspx_meth_sql_query_2(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                      </table>\n");
      out.write("                                    \n");
      out.write("                        \n");
      out.write("                                    <input class=\"btn btn-success\" type=\"submit\"/>\n");
      out.write("                        \n");
      out.write("                      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                  \n");
      out.write("                    </div>\n");
      out.write("                    <!-- End SmartWizard Content -->\n");
      out.write("                      </form>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"x_panel\">\n");
      out.write("                  <div class=\"x_title\">\n");
      out.write("                    <h2>Datos</h2>\n");
      out.write("                    <ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"x_content\">\n");
      out.write("                    <br />\n");
      out.write("                       ");
      if (_jspx_meth_sql_query_3(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("\n");
      out.write("                       ");
      //  display:table
      org.displaytag.tags.TableTag _jspx_th_display_table_0 = (org.displaytag.tags.TableTag) _jspx_tagPool_display_table_pagesize_name_id_htmlId_export_class.get(org.displaytag.tags.TableTag.class);
      _jspx_th_display_table_0.setPageContext(_jspx_page_context);
      _jspx_th_display_table_0.setParent(null);
      _jspx_th_display_table_0.setUid("material");
      _jspx_th_display_table_0.setHtmlId("datatable-responsive");
      _jspx_th_display_table_0.setClass("table table-striped table-bordered");
      _jspx_th_display_table_0.setPagesize(10);
      _jspx_th_display_table_0.setName((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${q2.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_display_table_0.setExport(true);
      int _jspx_eval_display_table_0 = _jspx_th_display_table_0.doStartTag();
      if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_table_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_table_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_display_column_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_table_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                   ");
          int evalDoAfterBody = _jspx_th_display_table_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_display_table_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_display_table_pagesize_name_id_htmlId_export_class.reuse(_jspx_th_display_table_0);
        return;
      }
      _jspx_tagPool_display_table_pagesize_name_id_htmlId_export_class.reuse(_jspx_th_display_table_0);
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("             <!-- footer content -->\n");
      out.write("    <footer>\n");
      out.write("          <div class=\"pull-right\">\n");
      out.write("            BIBLIOTECA UDB 2017 DAVID IBARRA\n");
      out.write("          </div>\n");
      out.write("          <div class=\"clearfix\"></div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- /footer content -->\n");
      out.write("    </body>\n");
      out.write("      </div>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "assent/footer.jsp", out, false);
      out.write(" \n");
      out.write("    </footer>\n");
      out.write("    ");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setVar("q3");
    _jspx_th_sql_query_0.setDataSource(new String("jdbc/mysql"));
    _jspx_th_sql_query_0.setSql("SELECT * FROM editorial");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource_nobody.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("x");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${q3.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.editorial_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" </option>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.editorial_nombre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent(null);
    _jspx_th_sql_query_1.setVar("q1");
    _jspx_th_sql_query_1.setDataSource(new String("jdbc/mysql"));
    _jspx_th_sql_query_1.setSql("SELECT * FROM tipomaterial");
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource_nobody.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("u");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${q1.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.TipoMaterial_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write(" </option>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.TipoMaterial_nombre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_sql_query_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_2.setParent(null);
    _jspx_th_sql_query_2.setVar("q2");
    _jspx_th_sql_query_2.setDataSource(new String("jdbc/mysql"));
    _jspx_th_sql_query_2.setSql("SELECT * FROM autor");
    int[] _jspx_push_body_count_sql_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_2 = _jspx_th_sql_query_2.doStartTag();
      if (_jspx_th_sql_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_2.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource_nobody.reuse(_jspx_th_sql_query_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("a");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${q2.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("</td>\n");
          out.write("                                            <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("</td>\n");
          out.write("                                            <td>");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("</td>    \n");
          out.write("                                            <td>\n");
          out.write("                                            <label><input type=\"radio\" name=\"autor\" id=\"\" value=\"");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\" > ");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write(" </label>\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.autor_id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.autor_nombre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.autor_descripcion}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.autor_id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.autor_nombre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_sql_query_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_3 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_3.setParent(null);
    _jspx_th_sql_query_3.setVar("q2");
    _jspx_th_sql_query_3.setDataSource(new String("jdbc/mysql"));
    _jspx_th_sql_query_3.setSql("select * from material inner join autor on autor.autor_id=material.id_autor inner join editorial on material.id_editorial = editorial.editorial_id inner join tipomaterial on material.id_TipoMaterial = tipomaterial.TipoMaterial_id");
    int[] _jspx_push_body_count_sql_query_3 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_3 = _jspx_th_sql_query_3.doStartTag();
      if (_jspx_th_sql_query_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_3.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource_nobody.reuse(_jspx_th_sql_query_3);
    }
    return false;
  }

  private boolean _jspx_meth_display_column_0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_0 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_0.setPageContext(_jspx_page_context);
    _jspx_th_display_column_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_0.setTitle("#");
    _jspx_th_display_column_0.setProperty("material_id");
    _jspx_th_display_column_0.setSortable(true);
    int _jspx_eval_display_column_0 = _jspx_th_display_column_0.doStartTag();
    if (_jspx_th_display_column_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_0);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_0);
    return false;
  }

  private boolean _jspx_meth_display_column_1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_1 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_1.setPageContext(_jspx_page_context);
    _jspx_th_display_column_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_1.setTitle("ISBN");
    _jspx_th_display_column_1.setProperty("material_isbn");
    _jspx_th_display_column_1.setSortable(true);
    int _jspx_eval_display_column_1 = _jspx_th_display_column_1.doStartTag();
    if (_jspx_th_display_column_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_1);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_1);
    return false;
  }

  private boolean _jspx_meth_display_column_2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_2 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_2.setPageContext(_jspx_page_context);
    _jspx_th_display_column_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_2.setTitle("Nombre");
    _jspx_th_display_column_2.setProperty("material_nombre");
    _jspx_th_display_column_2.setSortable(true);
    int _jspx_eval_display_column_2 = _jspx_th_display_column_2.doStartTag();
    if (_jspx_th_display_column_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_2);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_2);
    return false;
  }

  private boolean _jspx_meth_display_column_3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_3 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_3.setPageContext(_jspx_page_context);
    _jspx_th_display_column_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_3.setTitle("Descripcion");
    _jspx_th_display_column_3.setProperty("material_descripcion");
    _jspx_th_display_column_3.setSortable(true);
    int _jspx_eval_display_column_3 = _jspx_th_display_column_3.doStartTag();
    if (_jspx_th_display_column_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_3);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_3);
    return false;
  }

  private boolean _jspx_meth_display_column_4(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_4 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_4.setPageContext(_jspx_page_context);
    _jspx_th_display_column_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_4.setTitle("Autor");
    _jspx_th_display_column_4.setProperty("autor_nombre");
    _jspx_th_display_column_4.setSortable(true);
    int _jspx_eval_display_column_4 = _jspx_th_display_column_4.doStartTag();
    if (_jspx_th_display_column_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_4);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_4);
    return false;
  }

  private boolean _jspx_meth_display_column_5(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_5 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_5.setPageContext(_jspx_page_context);
    _jspx_th_display_column_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_5.setTitle("Año");
    _jspx_th_display_column_5.setProperty("material_anio");
    _jspx_th_display_column_5.setSortable(true);
    int _jspx_eval_display_column_5 = _jspx_th_display_column_5.doStartTag();
    if (_jspx_th_display_column_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_5);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_5);
    return false;
  }

  private boolean _jspx_meth_display_column_6(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_6 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_6.setPageContext(_jspx_page_context);
    _jspx_th_display_column_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_6.setTitle("Ejemplares");
    _jspx_th_display_column_6.setProperty("ejemplares");
    _jspx_th_display_column_6.setSortable(true);
    int _jspx_eval_display_column_6 = _jspx_th_display_column_6.doStartTag();
    if (_jspx_th_display_column_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_6);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_6);
    return false;
  }

  private boolean _jspx_meth_display_column_7(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_7 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_7.setPageContext(_jspx_page_context);
    _jspx_th_display_column_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_7.setTitle("Edicion");
    _jspx_th_display_column_7.setProperty("material_edicion");
    _jspx_th_display_column_7.setSortable(true);
    int _jspx_eval_display_column_7 = _jspx_th_display_column_7.doStartTag();
    if (_jspx_th_display_column_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_7);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_7);
    return false;
  }

  private boolean _jspx_meth_display_column_8(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_8 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_8.setPageContext(_jspx_page_context);
    _jspx_th_display_column_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_8.setTitle("Fecha Registro");
    _jspx_th_display_column_8.setProperty("material_fechaRegistro");
    _jspx_th_display_column_8.setSortable(true);
    int _jspx_eval_display_column_8 = _jspx_th_display_column_8.doStartTag();
    if (_jspx_th_display_column_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_8);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_8);
    return false;
  }

  private boolean _jspx_meth_display_column_9(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_9 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_9.setPageContext(_jspx_page_context);
    _jspx_th_display_column_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_9.setTitle("Editorial");
    _jspx_th_display_column_9.setProperty("editorial_nombre");
    _jspx_th_display_column_9.setSortable(true);
    int _jspx_eval_display_column_9 = _jspx_th_display_column_9.doStartTag();
    if (_jspx_th_display_column_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_9);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_9);
    return false;
  }

  private boolean _jspx_meth_display_column_10(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_10 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_10.setPageContext(_jspx_page_context);
    _jspx_th_display_column_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_10.setTitle("# Paginas/Tracks");
    _jspx_th_display_column_10.setProperty("material_paginas");
    _jspx_th_display_column_10.setSortable(true);
    int _jspx_eval_display_column_10 = _jspx_th_display_column_10.doStartTag();
    if (_jspx_th_display_column_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_10);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_10);
    return false;
  }

  private boolean _jspx_meth_display_column_11(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_11 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_11.setPageContext(_jspx_page_context);
    _jspx_th_display_column_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_11.setTitle("Tipo de material");
    _jspx_th_display_column_11.setProperty("TipoMaterial_nombre");
    _jspx_th_display_column_11.setSortable(true);
    int _jspx_eval_display_column_11 = _jspx_th_display_column_11.doStartTag();
    if (_jspx_th_display_column_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_11);
      return true;
    }
    _jspx_tagPool_display_column_title_sortable_property_nobody.reuse(_jspx_th_display_column_11);
    return false;
  }

  private boolean _jspx_meth_display_column_12(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_12 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_12.setPageContext(_jspx_page_context);
    _jspx_th_display_column_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_12.setTitle("Opciones");
    int _jspx_eval_display_column_12 = _jspx_th_display_column_12.doStartTag();
    if (_jspx_eval_display_column_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_12.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                     <a type=\"button\" href=\"editform/materialMain.jsp?isbn=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${material.material_isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&ejemplares=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${material.ejemplares}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&tipo=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${material.TipoMaterial_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&paginas=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${material.material_paginas}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&editorial=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${material.editorial_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&fechaRegistro=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${material.material_fechaRegistro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&edicion=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${material.material_edicion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&anio=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${material.material_anio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&descripcion=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${material.material_descripcion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&nombre=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${material.material_nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${material.material_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"btn btn-info\">Modificar</a>\n");
        out.write("                                     <a href=\"/biblioteca-2017v2/controladorMaterial?metodo=eliminar&id=");
        if (_jspx_meth_c_out_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_column_12, _jspx_page_context))
          return true;
        out.write("\" type=\"button\" class=\"btn btn-danger\">Eliminar</a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_display_column_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_12);
      return true;
    }
    _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_12);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_12);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${material.material_id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }
}
