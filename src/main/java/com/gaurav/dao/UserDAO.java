package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.User;


public interface UserDAO {
	
	public void addUser(User user);

	public List<User> getAllUsers();
	
	public User updateUser(User user);
	
	public User getUser(String userEmail);

}
