package com.fsq.test;

import java.sql.SQLException;

import com.fsq.dao.PhotoDAO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhotoDAO pd=new PhotoDAO();
		try {
			pd.getAllPhotos();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
