package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>首页</title>\r\n");
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
      out.write("/js/index.js\"></script>\r\n");
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
      out.write("\t\t\t\t\t\t<i class=\"fa fa-bars icon\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<ol class=\"breadcrumb navbar-breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\">首页</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-right-expand-toggle pull-right visible-xs\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-th icon\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-right-expand-toggle pull-right visible-xs\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-times icon\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-times icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
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
      out.write("\t\t\t\t\t\t<div class=\"row  no-margin-bottom\" style=\"margin-top: 40px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<span style=\"color: black;margin-left: 450px; font-size: 40px;\">国家煤炭交易平台</span>\r\n");
      out.write("\t\t\t\t\t\t\t<hr/>\r\n");
      out.write("\t\t\t\t\t\t\t<text style=\"color: black;margin-left: 40px; font-size: 25px;\">说明</text>\r\n");
      out.write("\t\t\t\t\t\t\t<br/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<text style=\"color: black;margin-left: 90px; font-size: 20px;\">1.基于SSM框架实现。</text>\r\n");
      out.write("\t\t\t\t\t\t\t<br/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<text style=\"color: black;margin-left: 90px; font-size: 20px;\">2.功能模块：用户登录，用户管理，采购申请，采购审核等。</text>\r\n");
      out.write("\t\t\t\t\t\t\t<br/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<text style=\"color: black;margin-left: 90px; font-size: 20px;\">3.使用HttpSession保存用户登录状态，用户类型有平台管理员，公司员工（申请人），公司经理（审核人），\r\n");
      out.write("\t\t\t\t\t\t\t\t不同角色拥有不同的功能（权限），比如只有个平台管理员才能添加删除用户，再如审核人查看不到申请人未提交的采购记录（状态为草稿）。</text>\r\n");
      out.write("\t\t\t\t\t\t\t<br/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<text style=\"color: black;margin-left: 90px; font-size: 20px;\">4.本平台的不足之处是数据格式没有明确要求，只能单例登录，数据多表操作少等等。</text>\r\n");
      out.write("\t\t\t\t\t\t\t<br/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<text style=\"color: black;margin-left: 90px; font-size: 20px;\">5.本平台作为个人学习SSM框架的DEMO。</text>\r\n");
      out.write("\t\t\t\t\t\t\t<br/><br/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row  no-margin-bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--轮播-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"myCarousel\" class=\"carousel slide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/Carousel1.jpg\" alt=\"First slide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/Carousel2.jpg\" alt=\"Second slide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/Carousel3.jpg\" alt=\"Third slide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\"> <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">Previous</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\"> <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">Next</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--公告栏-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card card-success\" style=\"min-height: 500px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"card-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-comments-o\"></i> 公告栏\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clear-both\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body no-padding\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"message-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"form/notice.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"username\">【公司名称】标题</span> <span class=\"message-datetime\">2019-07-18</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"form/notice.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"username\">【公司名称】标题</span> <span class=\"message-datetime\">2019-07-18</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"form/notice.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"username\">【公司名称】标题</span> <span class=\"message-datetime\">2019-07-18</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"form/notice.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"username\">【公司名称】标题</span> <span class=\"message-datetime\">2019-07-18</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"form/notice.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"username\">【公司名称】标题</span> <span class=\"message-datetime\">2019-07-18</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row  no-margin-bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--采购审核-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card card-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"card-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-comments-o\"></i> 采购申请审核\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clear-both\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>序号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>单据编号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>创建日期</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>煤种</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>数量（万吨）</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>结算方式</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>发起人</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>状态</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电2019071801</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019-7-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>烟煤</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>一票结算</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>待审核</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"buy/reviewBuy.html\">审核</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电2019071801</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019-7-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>烟煤</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>一票结算</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>待审核</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"buy/reviewBuy.html\">审核</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电2019071801</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019-7-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>烟煤</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>一票结算</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>待审核</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"buy/reviewBuy.html\">审核</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电2019071801</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019-7-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>烟煤</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>一票结算</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>待审核</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"buy/reviewBuy.html\">审核</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电2019071801</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019-7-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>烟煤</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>一票结算</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>待审核</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"buy/reviewBuy.html\">审核</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电2019071801</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019-7-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>烟煤</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>一票结算</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>待审核</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"buy/reviewBuy.html\">审核</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电2019071801</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019-7-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>烟煤</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>一票结算</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>待审核</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"buy/reviewBuy.html\">审核</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电2019071801</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019-7-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>烟煤</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>一票结算</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>待审核</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"buy/reviewBuy.html\">审核</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row  no-margin-bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--采购执行填报-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card card-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"card-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-star-half-o\"></i> 采购执行填报\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clear-both\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>序号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>单据编号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>下达日期</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>煤种</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>采购数量（万吨）</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>收到基低位发热量</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>运输方式</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>订单状态</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电2019071801</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019-7-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>烟煤</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>5200</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>船运</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>已下达</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>审核</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电2019071801</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019-7-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>烟煤</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>5200</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>船运</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>已下达</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>审核</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电2019071801</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019-7-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>烟煤</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>5200</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>船运</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>已下达</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>审核</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>中能热电2019071801</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019-7-18</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>烟煤</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>5200</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>船运</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>已下达</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>审核</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<footer class=\"app-footer\">\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"> <i class=\"fa fa-long-arrow-up\"></i>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<span>版权由gnosed所有</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t<div>\r\n");
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
    // /jsp/index.jsp(133,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /jsp/index.jsp(154,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /jsp/index.jsp(162,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /jsp/index.jsp(165,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
}
