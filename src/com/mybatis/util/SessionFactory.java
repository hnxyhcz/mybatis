package com.mybatis.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.inter.IUserOperation;

public class SessionFactory {
	private static SqlSessionFactory sessionFactory;
	private static Reader reader;
	
	static{
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSession(){
		return sessionFactory;
	}
}
