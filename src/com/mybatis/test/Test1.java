package com.mybatis.test;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.bean.User;
import com.mybatis.util.SessionFactory;

public class Test1 {
	public static void main(String[] args) {
		SqlSession session = SessionFactory.getSqlSession().openSession();
		User user = (User)session.selectOne("com.mybatis.bean.UserMapper.selectUserById",1);
		System.out.println(user.getUserAddress());
        System.out.println(user.getUserName());
	}
}
