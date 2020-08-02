package com.fsq.biz;

import java.sql.SQLException;
import java.util.List;

import com.fsq.beans.Photo;
import com.fsq.dao.PhotoDAO;

public class PhotoBiz {

	private PhotoDAO photoDAO;

	public List<Photo> getAllPhotos() throws SQLException {
		photoDAO = new PhotoDAO();
		return photoDAO.getAllPhotos();
	}
	public List<Photo> getCateGoryPhotos(int id) throws SQLException {
		photoDAO = new PhotoDAO();
		return photoDAO.getAllPhotosByClassId(id);
	}
	

}