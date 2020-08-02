package com.fsq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fsq.beans.PingLun;
import com.fsq.util.JdbcUtil;

public class PingLunDAO {
	// ����ͼƬid��ѯ��Ӧ����������
	public List<PingLun> searchByPhotoId(int id) throws SQLException {
		List<PingLun> pingLunList = new ArrayList<PingLun>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Connection conn = JdbcUtil.getConnection();
			String sql = "select id,contentText,contentTime,name,pid from pinglun where pid=? order by id desc";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				PingLun pingLun = new PingLun();
				pingLun.setId(rs.getInt(1));
				pingLun.setContentText(rs.getString(2));
				pingLun.setContentTime(rs.getString(3));// ����ʱ��
				pingLun.setName(rs.getString(4));
				pingLun.setPid(rs.getInt(5));
				pingLunList.add(pingLun);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			JdbcUtil.close(rs, ps);
			JdbcUtil.close();
		}
		return pingLunList;
	}

	// ����id��ѯ��������
	public List<PingLun> searchByPingLunId(int id) throws SQLException {
		List<PingLun> pingLunList = new ArrayList<PingLun>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Connection conn = JdbcUtil.getConnection();
			String sql = "select * from pinglun where id=? order by id desc";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				PingLun pingLun = new PingLun();
				pingLun.setId(rs.getInt(1));
				pingLun.setContentText(rs.getString(2));
				pingLun.setContentTime(rs.getString(3));
				pingLun.setName(rs.getString(4));
				pingLun.setPid(rs.getInt(5));
				pingLunList.add(pingLun);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			JdbcUtil.close(rs, ps);
			JdbcUtil.close();
		}
		return pingLunList;
	}

	public boolean update(PingLun pingLun) throws SQLException {
		boolean flag = false;
		PreparedStatement ps = null;
		String sql = "update pinglun set contentText=?,name=?,contentTime=? where id=?";
		try {
			Connection conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, pingLun.getContentText());
			ps.setString(2, pingLun.getName());
			ps.setString(3, pingLun.getContentTime());
			ps.setInt(4, pingLun.getId());
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

	// ɾ��ĳ��ͼƬ����������
	public boolean deleteByPid(int pid) throws SQLException {
		String sql = "delete from pinglun where pid=?";
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, pid);
			int n = ps.executeUpdate();
			if (n != 0) {
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

	// ɾ����������

	public boolean deleteById(int id) throws SQLException {
		String sql = "delete from pinglun where id=?";
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			// ps.executeUpdate();
			int n = ps.executeUpdate();
			if (n != 0) {
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

	public boolean insert(PingLun pinglun) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "insert into pinglun(contentText,contentTime,name,pid) values(?,?,?,?)";
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, pinglun.getContentText());
			ps.setString(2, pinglun.getContentTime());
			ps.setString(3, pinglun.getName());
			ps.setInt(4, pinglun.getPid());
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