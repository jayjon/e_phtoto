package com.fsq.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JdbcUtil {

	private static final ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

	private static DataSource ds;

	static {
		BasicDataSource bds = new BasicDataSource();
//		bds.setUrl("jdbc:mysql://localhost:3306/photo?useUnicode=yes&characterEncoding=utf8");
	    bds.setUrl("jdbc:mysql://39.105.162.107:3306/photo?useUnicode=yes&characterEncoding=utf8");
		bds.setUsername("root");
//		bds.setPassword("1234");
		bds.setPassword("");
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		//bds.setDriverClassName("com.mariadb.jdbc.Driver");
		bds.setInitialSize(1);
		bds.setMaxActive(2);
 
		ds = bds;
	}

	public static Connection getConnection() throws SQLException {
		Connection conn = (Connection) threadLocal.get();
		if (conn != null) {
			return conn;
		}
		conn = ds.getConnection();
		threadLocal.set(conn);
		return conn;
	}

	public static void close(ResultSet rs, PreparedStatement ps) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				rs = null;
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				ps = null;
			}
		}
	}

	public static void close() {
		Connection conn = (Connection) threadLocal.get();
		if (null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				threadLocal.set(null);
			}
		}
	}
	public static void main(String args[]){
		System.out.println("���ݿ����ӡ�������");
		try {
			JdbcUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
