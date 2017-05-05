package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class autorMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_table_pagesize_name_id_export;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title_sortable_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_sql_dataSource_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_table_pagesize_name_id_export = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title_sortable_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_sql_dataSource_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_display_table_pagesize_name_id_export.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_display_column_title_sortable_property_nobody.release();
    _jspx_tagPool_display_column_title.release();
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
      out.write("        <title>MANTENIMINETO AUTORES</title>\n");
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
      out.write("                    <h2>Configuracion Autores</h2>\n");
      out.write("                    <ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"x_content\">\n");
      out.write("                    <br />\n");
      out.write("                    <form id=\"demo-form2\" data-parsley-validate class=\"form-horizontal form-label-left\" action=\"/biblioteca-2017/controladorAutor\" method=\"post\">\n");
      out.write("\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"nombre\">Nombre <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                            <input type=\"text\" name=\"nombre\" id=\"nombre\" required=\"required\"  class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-md-3 col-sm-3 col-xs-12\"  for=\"descripcion\">Descripcion <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                          <input type=\"text\" name=\"descripcion\" id=\"descripcion\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                            \n");
      out.write("                        <input type=\"hidden\" name=\"metodo\" value=\"insertar\">\n");
      out.write("                      <div class=\"ln_solid\"></div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12 col-md-offset-3\">\n");
      out.write("                          <button type=\"submit\" class=\"btn btn-success\">Guardar</button>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
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
      out.write("                    ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                        \n");
      out.write("                    ");
      //  display:table
      org.displaytag.tags.TableTag _jspx_th_display_table_0 = (org.displaytag.tags.TableTag) _jspx_tagPool_display_table_pagesize_name_id_export.get(org.displaytag.tags.TableTag.class);
      _jspx_th_display_table_0.setPageContext(_jspx_page_context);
      _jspx_th_display_table_0.setParent(null);
      _jspx_th_display_table_0.setUid("autor");
      _jspx_th_display_table_0.setPagesize(3);
      _jspx_th_display_table_0.setName((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${q1.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
          out.write("                   ");
          int evalDoAfterBody = _jspx_th_display_table_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_display_table_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_display_table_pagesize_name_id_export.reuse(_jspx_th_display_table_0);
        return;
      }
      _jspx_tagPool_display_table_pagesize_name_id_export.reuse(_jspx_th_display_table_0);
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <!---\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                      <thead>\n");
      out.write("                        <tr>\n");
      out.write("                          <th>#</th>\n");
      out.write("                          <th>Nombre</th>\n");
      out.write("                          <th>Descripcion</th>\n");
      out.write("                          <th>Opciones</th>\n");
      out.write("                        </tr>\n");
      out.write("                      </thead>\n");
      out.write("                      <tbody>\n");
      out.write("                          \n");
      out.write("                       \n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                      </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                    -->\n");
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
    _jspx_th_sql_query_0.setVar("q1");
    _jspx_th_sql_query_0.setDataSource(new String("jdbc/mysql"));
    _jspx_th_sql_query_0.setSql("SELECT * FROM autor");
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

  private boolean _jspx_meth_display_column_0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_table_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_column_0 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title_sortable_property_nobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_0.setPageContext(_jspx_page_context);
    _jspx_th_display_column_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_0.setTitle("Codigo");
    _jspx_th_display_column_0.setProperty("autor_id");
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
    _jspx_th_display_column_1.setTitle("Descripcion");
    _jspx_th_display_column_1.setProperty("autor_descripcion");
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
    org.displaytag.tags.ColumnTag _jspx_th_display_column_2 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_column_2.setPageContext(_jspx_page_context);
    _jspx_th_display_column_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
    _jspx_th_display_column_2.setTitle("Funciones");
    int _jspx_eval_display_column_2 = _jspx_th_display_column_2.doStartTag();
    if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_display_column_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_display_column_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                     <a type=\"button\" class=\"btn btn-info\">Modificar</a>\n");
        out.write("                                     <a href=\"/biblioteca-2017/controladorAutor?metodo=eliminar&id=");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_display_column_2, _jspx_page_context))
          return true;
        out.write("\" type=\"button\" class=\"btn btn-danger\">Eliminar</a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_display_column_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_display_column_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_2);
      return true;
    }
    _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_2);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_column_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_2);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${autor.autor_id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
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
    _jspx_th_c_forEach_0.setVar("u");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${q1.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("                            <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                            <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                            <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                            <td><a type=\"button\" class=\"btn btn-info\">Modificar</a>\n");
          out.write("                                <a href=\"/biblioteca-2017/controladorAutor?metodo=eliminar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.autor_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" type=\"button\" class=\"btn btn-danger\">Eliminar</a></td>\n");
          out.write("                        </tr>\n");
          out.write("                        ");
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

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.autor_id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.autor_nombre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.autor_descripcion}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}
