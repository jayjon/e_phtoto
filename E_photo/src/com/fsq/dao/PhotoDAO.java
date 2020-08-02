package com.fsq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fsq.beans.Photo;
import com.fsq.util.JdbcUtil;

public class PhotoDAO {

	public List<Photo> getAllPhotos() throws SQLException {
		List<Photo> photoList = new ArrayList<Photo>();
		String sql = "select * from photo";
		Connection conn = JdbcUtil.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Photo photo = new Photo();
				photo.setId(rs.getInt("id"));
				photo.setName(rs.getString("name"));
				photo.setPath(rs.getString("path"));
				photo.setDianji(rs.getInt("dianji"));
				photo.setContentTime(rs.getString("contenttime"));
				photo.setShuoming(rs.getString("shuoming"));
				photo.setLid(rs.getInt("lid"));
				photoList.add(photo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			JdbcUtil.close(rs, null);
			JdbcUtil.close();
		}
		return photoList;
	}

	public void delete(Photo photo) throws SQLException {
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement ps = null;
		String sql = "delete  from photo where id=?";

		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, photo.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			JdbcUtil.close(null, ps);
			JdbcUtil.close();
		}
	}

	public boolean updateDianJi(Photo photo) throws SQLException {
		boolean flag = false;
		PreparedStatement ps = null;
		String sql = "UPDATE photo SET dianji=dianji+1 where id=?";
		try {
			Connection conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, photo.getId());
			int n = ps.executeUpdate();
			if (n != 0) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			JdbcUtil.close(null, ps);
			JdbcUtil.close();
		}
		return flag;
	}

	public void update(Photo photo) throws SQLException {
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement ps = null;
		String sql = "update photo set name=?,shuoming=?,lid=? where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, photo.getName());
			ps.setString(2, photo.getShuoming());
			ps.setInt(3, photo.getLid());
			ps.setInt(4, photo.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			JdbcUtil.close(null, ps);
			JdbcUtil.close();
		}
	}

	public List<Photo> getAllPhotosByClassId(int id) throws SQLException {
		List<Photo> photoList = new ArrayList<Photo>();
		String sql = "select id,name,path,dianji,shuoming from photo where lid=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Connection conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				Photo photo = new Photo();
				photo.setId(rs.getInt(1));
				photo.setName(rs.getString(2));
				photo.setPath(rs.getString(3));
				photo.setDianji(rs.getInt(4));
				photo.setShuoming(rs.getString(5));
				photoList.add(photo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			JdbcUtil.close(rs, ps);
			JdbcUtil.close();
		}
		return photoList;
	}

	public Photo getPhotoById(int id) throws SQLException {
		String sql = "select id,name,path,contentTime,shuoming,lid from photo where id=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Connection conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				Photo photo = new Photo();
				photo.setId(rs.getInt(1));
				photo.setName(rs.getString(2));
				photo.setPath(rs.getString(3));
				photo.setContentTime(rs.getString(4));
				photo.setShuoming(rs.getString(5));
				photo.setLid(rs.getInt(6));
				return photo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, ps);
			JdbcUtil.close();
		}
		return null;
	}

	public boolean insert(Photo photo) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			String sql = "insert into photo (name,path,shuoming,contentTime,lid,dianji) values(?,?,?,?,?,0)";
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, photo.getName());
			ps.setString(2, photo.getPath());
			ps.setString(3, photo.getShuoming());
			ps.setString(4, photo.getContentTime());
			ps.setInt(5, photo.getLid());
			int num = ps.executeUpdate();
			if (num != 0) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			JdbcUtil.close(null, ps);
			JdbcUtil.close();
		}
	}

}