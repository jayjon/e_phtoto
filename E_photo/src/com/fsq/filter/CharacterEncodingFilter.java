package com.fsq.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;


public class CharacterEncodingFilter extends HttpServlet implements Filter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String encoding = "";

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if (encoding != null) {
			request.setCharacterEncoding(encoding);
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {
		this.encoding = config.getInitParameter("econding");
	}

}
