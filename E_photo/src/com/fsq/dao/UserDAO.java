package com.fsq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fsq.beans.User;
import com.fsq.util.JdbcUtil;

public class UserDAO {

	public boolean isCheck(String username, String password)
			throws SQLException {
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select username from admin where username=? and password=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
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

	public boolean updatePassWord(User user) throws SQLException {
		PreparedStatement ps = null;
		String sql = "update admin set password=? where username=?";
		try {
			Connection conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getPassword());
			ps.setString(2, user.getUsername());
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