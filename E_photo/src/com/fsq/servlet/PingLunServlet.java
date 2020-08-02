package com.fsq.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fsq.beans.PingLun;
import com.fsq.dao.PingLunDAO;

public class PingLunServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PingLunServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		if ("insert".equals(action)) {
			String pid = request.getParameter("pid");
			String name = request.getParameter("name");
			String contentText = request.getParameter("pinglun");
			String contenttime = "";
			Date dt = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
			contenttime = sdf.format(dt);
			PingLun pingLun = new PingLun();
			pingLun.setContentText(contentText);
			pingLun.setContentTime(contenttime);
			pingLun.setName(name);
			pingLun.setPid(Integer.parseInt(pid));
			PingLunDAO pingLunDAO = new PingLunDAO();
			try {
				pingLunDAO.insert(pingLun);
				request.setAttribute("msg", "您已成功添加评论!");
				request.getRequestDispatcher("/cresult.jsp").forward(request,
						response);
			} catch (SQLException e) {
				request.setAttribute("msg", "数据库错误");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
				e.printStackTrace();
			}
		}
		if ("delete".equals(action)) {
			String id = request.getParameter("id").trim();
			PingLunDAO pingLunDAO = new PingLunDAO();
			try {
				if (pingLunDAO.deleteById(Integer.parseInt(id))) {
					request.setAttribute("msg", "评论删除成功!!!");
					request.getRequestDispatcher("/admin/result.jsp").forward(
							request, response);
				}
			} catch (NumberFormatException e) {
				request.setAttribute("msg", "数据格式错误");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
				e.printStackTrace();
			} catch (SQLException e) {
				request.setAttribute("msg", "数据库错误");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
				e.printStackTrace();
			}
		}
		if ("deleteAll".equals(action)) {
			String pid = request.getParameter("pid").trim();
			PingLunDAO pingLunDAO = new PingLunDAO();
			try {
				if (pingLunDAO.deleteByPid(Integer.parseInt(pid))) {
					request.setAttribute("msg", "该照片的所有评论已经全部删除!!!");
					request.getRequestDispatcher("/admin/result.jsp").forward(
							request, response);
				}
			} catch (NumberFormatException e) {
				request.setAttribute("msg", "数据格式错误");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
				e.printStackTrace();
			} catch (SQLException e) {
				request.setAttribute("msg", "数据库错误");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
				e.printStackTrace();
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

	public void init() throws ServletException {
	}

}
