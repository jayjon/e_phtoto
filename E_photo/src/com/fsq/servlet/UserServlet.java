package com.fsq.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fsq.beans.User;
import com.fsq.dao.UserDAO;

public class UserServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserServlet() {
		super();
	}
	public void destroy() {
		super.destroy(); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();

		String action = request.getParameter("action");
		if("update".equals(action)){
			String username=request.getParameter("username").trim();
			String password=request.getParameter("password").trim();
			String confirmPassword=request.getParameter("confirmpass").trim();
			if(password.equals(confirmPassword)){
				User user=new User();
				user.setUsername(username);
				user.setPassword(password);
				UserDAO userDAO=new UserDAO();
				try {
					userDAO.updatePassWord(user);
					request.setAttribute("msg", "��ϲ�������޸ĳɹ���");
					request.getRequestDispatcher("/admin/result.jsp").forward(request, response);
				} catch (SQLException e) {
					request.setAttribute("msg", "���ݿ����");
					request.getRequestDispatcher("/admin/result.jsp").forward(request, response);
					e.printStackTrace();
				}
			}else{
				request.setAttribute("msg", "�����������벻һ�£�");
				request.getRequestDispatcher("/admin/result.jsp").forward(request, response);
			}
		}
		if ("login".equals(action)) {
			try {
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				UserDAO userDAO = new UserDAO();
				if (userDAO.isCheck(username, password)) {
					request.getSession(true).setAttribute("user", user);
					request.getRequestDispatcher("/admin/admin.jsp").forward(request,
							response);
				} else {
					request.getRequestDispatcher("/admin/result.jsp").forward(
							request, response);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void init() throws ServletException {
	}

}
