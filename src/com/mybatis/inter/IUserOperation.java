package com.mybatis.inter;

import java.util.List;

import com.mybatis.bean.User;

public interface IUserOperation {
	public User selectUserById(int id);
	
	public List<User> selectUser(String userName);
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(int id);
}
