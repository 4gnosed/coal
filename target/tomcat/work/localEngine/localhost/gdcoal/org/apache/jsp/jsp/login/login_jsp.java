package org.apache.jsp.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>用户登录</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<!-- Fonts -->\r\n");
      out.write("<link\r\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<!-- CSS Libs -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/gdcoal/lib/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/gdcoal/lib/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/gdcoal/lib/css/animate.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/gdcoal/lib/css/bootstrap-switch.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/gdcoal/lib/css/checkbox3.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/gdcoal/lib/css/jquery.dataTables.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/gdcoal/lib/css/dataTables.bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/gdcoal/lib/css/select2.min.css\">\r\n");
      out.write("<!-- CSS App -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/gdcoal/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/gdcoal/css/themes/flat-blue.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"flat-blue login-page\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"login-box\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div class=\"login-form row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-12 text-center login-header\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"login-logo fa fa-connectdevelop fa-5x\"></i>\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"login-title\">国家煤炭交易平台</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"login-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"progress hidden\" id=\"login-progress\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"progress-bar progress-bar-success progress-bar-striped active\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trole=\"progressbar\" aria-valuenow=\"100\" aria-valuemin=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\taria-valuemax=\"100\" style=\"width: 100%\">Log In...</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"/gdcoal/login\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"用户名\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> <input type=\"password\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"密码\" name=\"password\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"login-button text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"登录\" class=\"btn btn-primary\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Javascript Libs -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/gdcoal/lib/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/gdcoal/lib/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/gdcoal/lib/js/Chart.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/gdcoal/lib/js/bootstrap-switch.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/gdcoal/lib/js/jquery.matchHeight-min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/gdcoal/lib/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/gdcoal/lib/js/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/gdcoal/lib/js/select2.full.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/gdcoal/lib/js/ace/ace.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/gdcoal/lib/js/ace/mode-html.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/gdcoal/lib/js/ace/theme-github.js\"></script>\r\n");
      out.write("\t<!-- Javascript -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/gdcoal/js/app.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
}
