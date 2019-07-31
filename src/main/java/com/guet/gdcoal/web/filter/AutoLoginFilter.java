package com.guet.gdcoal.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guet.gdcoal.model.User;

public class AutoLoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		// 强转
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		// 自动登录，判断session中没有登录用户，并且判断访问资源与登录不相关，则继续登录
		User user = (User) request.getSession().getAttribute("sessionuser");
		if (user != null) {
			if (!request.getRequestURI().contains("/login")) {

				Cookie[] cookies = request.getCookies();
				Cookie cookie = null;
				for (Cookie c : cookies) {
					if (c.getName().equals("sessionId")) {
						cookie = c;
						break;
					}
				}

				if (cookie != null) {
					request.getSession().setAttribute("sessionuser", user);
//					System.out.println("自动登录了！ " + user);
				}

			}
		}

		// 放行
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {

	}

}
