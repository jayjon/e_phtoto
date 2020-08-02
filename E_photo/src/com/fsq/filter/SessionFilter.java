package com.fsq.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionFilter implements Filter {

	public SessionFilter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		HttpSession session = request.getSession();
		// if(session==null){
		// request.setAttribute("msg", "您没有登录或登录超时，请重新登录");
		// request.getRequestDispatcher("/admin/result.jsp").forward(request,
		// response);
		// chain.doFilter(request, response);
		// }else{
		// request.getRequestDispatcher("/admin/admin.jsp");
		// }
		Object user = session.getAttribute("user");
		if (user != null) {
			chain.doFilter(request, response);
		} else {
			response.sendRedirect("/E_photo/login.jsp");
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
