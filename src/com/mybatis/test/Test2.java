package com.mybatis.test;

import java.util.List;	

import org.apache.ibatis.session.SqlSession;

import com.mybatis.bean.User;
import com.mybatis.inter.IUserOperation;
import com.mybatis.util.SessionFactory;

public class Test2 {
	public static void main(String[] args) {
		Test2 testUser=new Test2();
        testUser.getUserList("%");
	}
	public void getUserList(String userName){
		SqlSession session = SessionFactory.getSqlSession().openSession();
        try {
        	IUserOperation userOperation = session.getMapper(IUserOperation.class);         
            List<User> users = userOperation.selectUser(userName);
            for(User user:users){
                System.out.println(user.getId()+":"+user.getUserName()+":"+user.getUserAddress());
            }  
        } finally {
            session.close();
        }
	}
}
