package com.fsq.biz;

import java.sql.SQLException;

import com.fsq.dao.UserDAO;
import com.fsq.beans.User;


public class UserBiz {
	
	private boolean flag;
	private UserDAO userDAO;
	
	public String updatePassWord(String username,String password,String conformPassword) throws SQLException{
		userDAO=new UserDAO();
		String msg;
		if(password.equals(conformPassword)){
			User user=new User();
			user.setUsername(username);
			user.setPassword(password);
			flag=userDAO.updatePassWord(user);
			msg=flag==true ? "[��ʾ����ϲ�������޸ĳɹ���]":"[��ʾ����ϲ�������޸ĳɹ���]";
			
		}else{
			msg="[��ʾ���������ȷ�����벻һ�£�]";
		}
		return msg;
	}
	
}
