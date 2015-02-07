package com.mybatis.test;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.bean.User;
import com.mybatis.inter.IUserOperation;
import com.mybatis.util.SessionFactory;

public class TestAddUser {
	public static void main(String[] args) {
		User user = new User();
		user.setUserName("北京");
		user.setUserAge("24");
		user.setUserAddress("北京海淀区");
		SqlSession session = SessionFactory.getSqlSession().openSession();
		try{
			IUserOperation userOperation = session.getMapper(IUserOperation.class);
			userOperation.addUser(user);
			session.commit();
		}finally{
			session.close();
		}
	}
}
