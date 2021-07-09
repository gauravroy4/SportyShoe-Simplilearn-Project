package com.gaurav.service;

import java.util.List;

import com.gaurav.model.User;


public interface UserService {
	
	public void addUser(User user);

	public List<User> getAllUsers();


	public User getUser(String userEmail);

	public User updateUser(User user);
}
