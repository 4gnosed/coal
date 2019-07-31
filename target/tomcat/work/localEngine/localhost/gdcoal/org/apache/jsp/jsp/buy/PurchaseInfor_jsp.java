package org.apache.jsp.jsp.buy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PurchaseInfor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Flat Admin V.2 - Free Bootstrap Admin Templates</title>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<!-- Fonts -->\r\n");
      out.write("\t\t<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\t<link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\t<!-- CSS Libs -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/css/font-awesome.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/css/animate.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/css/bootstrap-switch.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/css/checkbox3.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/css/jquery.dataTables.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/css/dataTables.bootstrap.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/css/select2.min.css\">\r\n");
      out.write("\t\t<!-- CSS App -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/themes/flat-blue.css\">\r\n");
      out.write("\t\t<!-- Javascript Libs -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/js/Chart.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/js/bootstrap-switch.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/js/jquery.matchHeight-min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/js/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/js/select2.full.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/js/ace/ace.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/js/ace/mode-html.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/lib/js/ace/theme-github.js\"></script>\r\n");
      out.write("\t\t<!-- Javascript -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/app.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/theming.js\"></script>\r\n");
      out.write("\t\t<!-- Javascript -->\r\n");
      out.write("\t\t<!--My CSS-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/mystyle.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body class=\"flat-blue\">\r\n");
      out.write("\t\t<div class=\"app-container\">\r\n");
      out.write("\t\t\t<div class=\"row content-container\">\r\n");
      out.write("\t\t\t\t<nav class=\"navbar navbar-default navbar-fixed-top navbar-top\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-expand-toggle\">\r\n");
      out.write("                            <i class=\"fa fa-bars icon\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("\t\t\t\t\t\t\t<ol class=\"breadcrumb navbar-breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>采购</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\">采购申请信息表</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-right-expand-toggle pull-right visible-xs\">\r\n");
      out.write("                            <i class=\"fa fa-th icon\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-right-expand-toggle pull-right visible-xs\">\r\n");
      out.write("                            <i class=\"fa fa-times icon\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!--右上角用户退出登录-->\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown profile\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu animated fadeInDown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"profile-img\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/profile/picjumbo.com_HNCK4153_resize.jpg\" class=\"profile-img\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"profile-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"username\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.userEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"btn-group margin-bottom-2x\" role=\"group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logout?msg=退出登录\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-sign-out\"></i> Logout\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<div class=\"side-menu sidebar-inverse\">\r\n");
      out.write("\t\t\t\t\t<nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"side-menu-container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon fa fa-paper-plane\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"title\">国家煤炭交易平台</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-expand-toggle pull-right visible-xs\">\r\n");
      out.write("                                <i class=\"fa fa-times icon\"></i>\r\n");
      out.write("                            </button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jsp/index.jsp\"> <span class=\"icon fa fa-tachometer\"></span> <span class=\"title\">首页</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t<li class=\"panel panel-default dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" href=\"#dropdown-form\"> <span class=\"icon fa fa-file-text-o\"></span> <span class=\"title\">公告</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"dropdown-form\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"form/addNotice.html\">公告创建</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"form/manageNotice.html\">公告管理</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Dropdown-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\" panel panel-default dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" href=\"#dropdown-example\"> <span class=\"icon fa fa-slack\"></span> <span class=\"title\">用户</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- Dropdown level 1 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"dropdown-example\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/findCompany?companyId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.companyId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">用户信息</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Dropdown-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"panel panel-default dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" href=\"#component-example\"> <span class=\"icon fa fa-cubes\"></span> <span class=\"title\">采购</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- Dropdown level 1 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"component-example\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/findAllPurchase?userid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Dropdown-->\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- /.navbar-collapse -->\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Main Content -->\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t\t<div class=\"side-body padding-top\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row  no-margin-bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--采购审核-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card card-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"card-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-comments-o\">采购申请信息表</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clear-both\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-horizontal\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/submitPurchase?purid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.purId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&userid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa\">采购信息</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear-both\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"card-body\" style=\"padding: 2% 5%;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"col-sm-2 control-label\">报价截止日期:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.deadLine}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">申请单位：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.companyId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">单据编号：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.docNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">交货时间：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.deliTimeMin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('至');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.deliTimeMax}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">煤种：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.coal1Id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.coal2Id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">采购数量(万吨）：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">运输方式：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.transId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">交货地点：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.deliPlace}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">结算方式：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.cashId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">验收方式：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.checkId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">最高限价（元/卡.吨）：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.priceCeiling}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("(元/卡·吨)</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">最低限价（元/卡.吨）：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.priceBottom}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("(元/卡·吨)</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">限价说明：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.priceStatement}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">结付款方式：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.payType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">保证金要求：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-21\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">本次采购报价保证金标准：10元/吨，履约保证金标准：10元/吨； 参与报价时，供应商须先通过平台开立的保证金虚拟账户缴纳500,000元报价保证金； 中标信息公布后，未中标供应商的报价保证金将自动返回供应商保证金虚拟账户； 中标供应商与电厂签订采购合同时，供应商按电厂履约保证金要求及签约量缴纳履约保证金；在双方完成合同履约后，电厂将解冻履约保证金，履约保证金将返还供应商保证金虚拟账户。\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"card\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa\">煤质要求</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear-both\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-body\" style=\"padding: 2% 10%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"sub-title\">收到基基准</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">收到基低位发热量Qnet,ar≥(KCal/kg)：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.receQnet}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">收到基全硫St,ar≤(%)：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.receSt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">全水分M≤(%)：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.receM}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">收到基灰分Aar≤(%)：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.receAar}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">收到基挥发分Var(%)：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.receVarMin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('至');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.receVarMax}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"sub-title\">空气干燥基基准</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">空干基水分Mad≤(%)：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.airMad}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">空干基全硫St,ad≤(%)：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.airSt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">空干基挥发分Vad(%)：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.airVadMin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('至');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.airVadMax}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"sub-title\">干基基准</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">干基高位发热量Qgr,d≥(KCal/kg)：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.driedQgr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">干基全硫St,d≤(%)：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.driedSt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">干燥无灰基挥发分(%)：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.driedVadMin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('至');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.driedVadMax}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"card\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-body\" style=\"padding: 2% 10%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">粒度(mm)≤：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.particleSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">灰熔点ST(℃)≥：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.ST}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">哈式可磨系数(HGI)≥：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.HGI}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">备注：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-21\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-div\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.remark}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<center>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"返回\" onclick=\"javascript:history.back(-1)\" class=\"btn btn-default\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /jsp/buy/PurchaseInfor.jsp(136,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionuser.roleId==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/findAllCompany\">用户添加</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/accountManage\">用户管理</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /jsp/buy/PurchaseInfor.jsp(157,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.roleId != 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/findCompanyAfterAddBuy?companyid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.companyId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">采购申请</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /jsp/buy/PurchaseInfor.jsp(165,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.roleId==2 || sessionuser.roleId==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t采购申请查找\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /jsp/buy/PurchaseInfor.jsp(168,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.roleId == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t采购审核\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(null);
    // /jsp/buy/PurchaseInfor.jsp(386,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.roleId!=2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"card\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-header\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-title\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa\">审核意见</i>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"opinion\" id=\"opinionid\" placeholder=\"在此填写您的审核意见\" style=\"width: 530px; height: 160px; margin-left: 330px;margin-top: 40px;margin-bottom: 30px;text-align: center;\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent(null);
    // /jsp/buy/PurchaseInfor.jsp(404,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.roleId==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f6(_jspx_th_c_005fif_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
    // /jsp/buy/PurchaseInfor.jsp(406,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchase.statement == '草稿'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"提交\" name=\"submitType\" class=\"btn btn-default\"></input>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent(null);
    // /jsp/buy/PurchaseInfor.jsp(411,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.roleId==3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"审核\" name=\"submitType\" class=\"btn btn-default \"></input>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"驳回\" name=\"submitType\" class=\"btn btn-default \"></input>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent(null);
    // /jsp/buy/PurchaseInfor.jsp(422,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionuser.roleId!=2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"card\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-header\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-title\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa\">单据审批记录</i>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear-both\"></div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-body\" style=\"padding: 2% 10%;\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"table\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr class=\"active\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>序号</th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>单据</th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>操作人员</th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>审核时间</th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>操作</th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>审核意见</th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    // /jsp/buy/PurchaseInfor.jsp(446,15) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/jsp/buy/PurchaseInfor.jsp(446,15) '${checkedInfos}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${checkedInfos}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /jsp/buy/PurchaseInfor.jsp(446,15) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("n");
    // /jsp/buy/PurchaseInfor.jsp(446,15) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index+1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n.purId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n.time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n.operate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n.opinion}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
