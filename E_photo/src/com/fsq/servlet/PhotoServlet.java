package com.fsq.servlet;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.fsq.beans.Photo;
import com.fsq.beans.PhotoClass;
import com.fsq.beans.PingLun;
import com.fsq.biz.PhotoBiz;
import com.fsq.dao.PhotoClassDAO;
import com.fsq.dao.PhotoDAO;
import com.fsq.dao.PingLunDAO;
import com.fsq.util.ImageUtils;

public class PhotoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public PhotoServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

	@SuppressWarnings("unused")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String toUrl = "";
		String action = request.getParameter("action");
		if ("getAll".equals(action)) { // admin�Ĺ�����ҳ�� amain.jsp
			PhotoBiz photoBiz = new PhotoBiz();
			List<Photo> list = null;
			HttpSession session = request.getSession();
			try {
				list = photoBiz.getAllPhotos();
				request.setAttribute("selAllList", list);
				request.getRequestDispatcher("/admin/amain1.jsp").forward(
						request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if ("addPhoto".equals(action)) {
			List<PhotoClass> list = new PhotoClassDAO().getAllClass();
			request.setAttribute("list", list);
			request.getRequestDispatcher("admin/photo_add.jsp").forward(
					request, response);
		}
		if ("getAllClient".equals(action)) { // �ͻ��ĵ�¼ҳ�� main.jsp
			PhotoBiz photoBiz = new PhotoBiz();
			List<Photo> list = null;
			HttpSession session = request.getSession();
			try {
				list = photoBiz.getAllPhotos();
				request.setAttribute("selAllList", list);
				request.getRequestDispatcher("main.jsp").forward(request,
						response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if ("selOne".equals(action)) {
			try {
				String id = request.getParameter("id");
				String str = request.getParameter("str");
				if ("client".equals(str)) {
					Photo photo = new PhotoDAO().getPhotoById(Integer
							.parseInt(id));
					PhotoDAO photoDAO = new PhotoDAO();
					photoDAO.updateDianJi(photo);
					String pathMax = photo.getPath();
					String s[] = pathMax.split("_min");
					photo.setPath("uploadimg/" + s[0] + s[1]);
					request.setAttribute("photo", photo);
					List<PingLun> pingLunList = new PingLunDAO()
							.searchByPhotoId(Integer.parseInt(id));
					request.setAttribute("pingLunList", pingLunList);
					request.getRequestDispatcher("/admin/photo_one.jsp")
							.forward(request, response);
				} else if ("admin".equals(str)) {
					Photo photo = new PhotoDAO().getPhotoById(Integer
							.parseInt(id));
					String pathMax = photo.getPath();
					String s[] = pathMax.split("_min");
					photo.setPath("uploadimg/" + s[0] + s[1]);
					request.setAttribute("photo", photo);
					List<PingLun> pingLunList = new PingLunDAO()
							.searchByPhotoId(Integer.parseInt(id));
					request.setAttribute("pingLunList", pingLunList);
					request.getRequestDispatcher("/admin/photo_one_pinglun.jsp")
							.forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if ("toupdate".equals(action)) {
			String id = request.getParameter("id");
			try {
				Photo photo = new PhotoDAO().getPhotoById(Integer.parseInt(id));
				request.setAttribute("photo", photo);
				List<PhotoClass> list = new PhotoClassDAO().getAllClass();
				request.setAttribute("list", list);
				request.getRequestDispatcher("/admin/photo_manager.jsp")
						.forward(request, response);
			} catch (SQLException e) {
				request.setAttribute("msg", "���ݿ����");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
			}
		}
		if ("update1".equals(action)) {
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String shuoming = request.getParameter("shuoming");
			String lid = request.getParameter("lid");
			try {
				Photo photo = new PhotoDAO().getPhotoById(Integer.parseInt(id));
				photo.setName(name);
				photo.setShuoming(shuoming);
				photo.setLid(Integer.parseInt(lid));
				new PhotoDAO().update(photo);
				request.setAttribute("msg", "��ϲ����ͼƬ��Ϣ�޸ĳɹ�");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);

			} catch (NumberFormatException e) {
				request.setAttribute("msg", "���ݸ�ʽ����");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
				e.printStackTrace();
			} catch (SQLException e) {
				request.setAttribute("msg", "���ݿ����");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
				e.printStackTrace();
			}
		}
		if ("delete".equals(action)) {
			String id = request.getParameter("id");
			try {
				Photo photo = new PhotoDAO().getPhotoById(Integer.parseInt(id));
				new PhotoDAO().delete(photo);
				request.setAttribute("msg", "��ϲ����ͼƬ�ѳɹ�ɾ��");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
			} catch (NumberFormatException e) {
				request.setAttribute("msg", "���ݸ�ʽ����");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
				e.printStackTrace();
			} catch (SQLException e) {
				request.setAttribute("msg", "���ݿ����");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
				e.printStackTrace();
			}
		}
		if ("seeAllPhotosByClassId".equals(action)) { // ����鿴�� photoa_all.jsp
			String id = request.getParameter("id");
			String num = request.getParameter("num");
			if (Integer.parseInt(num) == 0) {
				request.setAttribute("msg", "�Բ���÷�����û���ļ�");
				request.getRequestDispatcher("/admin/result.jsp").forward(
						request, response);
			} else {

				try {
					List<Photo> photoList = new ArrayList<Photo>();
					PhotoDAO photoDAO = new PhotoDAO();
					photoList = photoDAO.getAllPhotosByClassId(Integer
							.parseInt(id));					
					request.setAttribute("photoList", photoList);
					request.getRequestDispatcher("/admin/photo_all.jsp")
							.forward(request, response);
				} catch (NumberFormatException e) {
					request.setAttribute("msg", "���ݸ�ʽ����");
					request.getRequestDispatcher("/admin/result.jsp").forward(
							request, response);
					e.printStackTrace();
				} catch (SQLException e) {
					request.setAttribute("msg", "���ݿ����");
					request.getRequestDispatcher("/admin/result.jsp").forward(
							request, response);
					e.printStackTrace();
				}

			}
		}
		if ("add".equals(action)) {
			boolean flag = false;
			Photo photo = new Photo();
			PhotoDAO photoDAO = new PhotoDAO();
			String msg = "";
			try {
				Calendar calendar = Calendar.getInstance();
				String newfilename = String.valueOf(calendar.getTimeInMillis());
				DiskFileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(factory);
				List<?> items = upload.parseRequest(request);
				Iterator<?> iter = items.iterator();
				while (iter.hasNext()) {
					FileItem item = (FileItem) iter.next();
					if (item.isFormField()) {
						String fieldName = item.getFieldName();
						String fieldValue = new String(item.getString("utf-8"));
						if ("shuoming".equals(fieldName)) {
							photo.setShuoming(fieldValue);
						} else if ("name".equals(fieldName)) {
							photo.setName(fieldValue);
						} else if ("lid".equals(fieldName)) {
							photo.setLid(Integer.parseInt(fieldValue));
						}
					} else {
						String fieldName = item.getFieldName();
						String fileName = item.getName();
						String ext = fileName.substring(fileName
								.lastIndexOf('.') + 1);
						String contentType = item.getContentType();
						boolean isInMemory = item.isInMemory();
						long sizeInBytes = item.getSize();
						String saveurl = request.getSession()
								.getServletContext().getRealPath("/")
								+ "uploadimg\\";
						String s = this.getServletContext().getRealPath("/");
						String newfilenamewithext = newfilename + "." + ext;
						File uploadedFile = new File(saveurl
								+ newfilenamewithext);
						item.write(uploadedFile);
						String newfilename_min = ImageUtils.createMinPic(
								saveurl, newfilename, ext);
						photo.setPath(newfilename_min);
						String contenttime = "";
						Date dt = new Date();
						SimpleDateFormat sdf = new SimpleDateFormat(
								"yyyy-MM-dd HH:mm:ss ");
						contenttime = sdf.format(dt);
						photo.setContentTime(contenttime);
					}
				}
				flag = photoDAO.insert(photo);
				if (flag) {
					msg = "��ϲ��ͼƬ��ӳɹ���";
				} else {
					msg = "�Բ���ͼƬ����ʧ�ܣ�";
				}
			} catch (Exception e) {
				e.printStackTrace();
				msg = "ͼƬ����ʧ�ܣ�";
			}
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("/admin/result.jsp").forward(request,
					response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	public void init() throws ServletException {
	}

}
