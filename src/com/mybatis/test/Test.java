package com.mybatis.test;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.bean.User;
import com.mybatis.inter.IUserOperation;
import com.mybatis.util.SessionFactory;

public class Test {
	public void update(){
		SqlSession session = SessionFactory.getSqlSession().openSession();
		try{
			IUserOperation userOperation = session.getMapper(IUserOperation.class);
			User user = userOperation.selectUserById(4);
			user.setUserAddress("beijing,haidian");
			user.setUserName("beijing");
			userOperation.updateUser(user);
			session.commit();
		}finally{
			session.close();
		}
	}
	
	private void delete(int id) {
		SqlSession session = SessionFactory.getSqlSession().openSession();
		try{
			IUserOperation userOperation = session.getMapper(IUserOperation.class);
			userOperation.deleteUser(id);
			session.commit();
		}finally{
			session.close();
		}
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.delete(2);
	}
}
