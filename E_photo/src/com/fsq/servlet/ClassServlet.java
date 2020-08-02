package com.fsq.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fsq.beans.PhotoClass;
import com.fsq.dao.PhotoClassDAO;
import com.fsq.util.Pager;

public class ClassServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClassServlet() {
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
		if ("add".equals(action)) {
			String contenttime = "";
			Date dt = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
			contenttime = sdf.format(dt);
			String name = request.getParameter("name");
			String shuoming = request.getParameter("shuoming");
			PhotoClass photoClass = new PhotoClass();
			photoClass.setName(name);
			photoClass.setShuoming(shuoming);
			photoClass.setContenttime(contenttime);
			PhotoClassDAO photoClassDAO = new PhotoClassDAO();
			try {
				photoClassDAO.insert(photoClass);
				request.setAttribute("msg", "恭喜您，分类插入成功");
				request.getRequestDispatcher("admin/result.jsp").forward(
						request, response);
			} catch (SQLException e) {
				request.setAttribute("msg", "对不起，分类插入失败");
				request.getRequestDispatcher("admin/result.jsp").forward(
						request, response);
				e.printStackTrace();
			}
		}
		if ("addClass".equals(action)) {
			request.getRequestDispatcher("/admin/class_add.jsp").forward(
					request, response);
		}
		if ("update".equals(action)) {
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String shuoming = request.getParameter("shuoming");
			String contenttime = "";
			Date dt = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
			contenttime = sdf.format(dt);
			try {
				PhotoClass photoClass = new PhotoClassDAO()
						.findClassById(Integer.parseInt(id));
				photoClass.setId(Integer.parseInt(id));
				photoClass.setName(name);
				photoClass.setShuoming(shuoming);
				photoClass.setContenttime(contenttime);
				new PhotoClassDAO().update(photoClass);
				request.setAttribute("msg", "恭喜您，修改成功");
				request.getRequestDispatcher("admin/result.jsp").forward(
						request, response);
			} catch (SQLException e) {
				request.setAttribute("msg", "数据库异常");
				request.getRequestDispatcher("admin/result.jsp").forward(
						request, response);
				e.printStackTrace();
			}

		}
		if ("toupdate".equals(action)) {
			String id = request.getParameter("id");
			try {
				PhotoClass photoClass = new PhotoClassDAO()
						.findClassById(Integer.parseInt(id));
				request.setAttribute("photoClass", photoClass);
				request.getRequestDispatcher("/admin/class_update.jsp")
						.forward(request, response);
			} catch (SQLException e) {
				request.setAttribute("msg", "数据库错误");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
			}

		}
		if ("delete".equals(action)) {
			String num = request.getParameter("num");
			String id = request.getParameter("id");
			int n = Integer.parseInt(num);
			if (n > 0) {
				request.setAttribute("msg", "该分类不为空，暂不能删除!");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
			} else {
				try {
					PhotoClass photoClass = new PhotoClassDAO()
							.findClassById(Integer.parseInt(id));
					new PhotoClassDAO().delete(photoClass);
					request.setAttribute("msg", "删除成功");
					request.getRequestDispatcher("/admin/result.jsp").forward(
							request, response);
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}		
		if ("getClassesByPage".equals(action)) { // 带分页的显示所有分类的页面
			try {				
				String num = request.getParameter("pageNo");
				int pageNo = 1;
				int pageSize = 5;
				if (null != num) {
					pageNo = Integer.parseInt(num);
				}
				Pager pager = new PhotoClassDAO().getClassesByPage(pageSize,
						pageNo);
				request.setAttribute("pager", pager);
				request.getRequestDispatcher("admin/listAllClassPage.jsp")
						.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("msg", "出错啦！ ");
				request.getRequestDispatcher("admin/result.jsp").forward(
						request, response);
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
