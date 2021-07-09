package com.gaurav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaurav.dao.UserDAO;
import com.gaurav.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public void addUser(User user) {
		userDAO.addUser(user);
		
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

	@Override
	public User getUser(String userEmail) {
		return userDAO.getUser(userEmail);
	}

	@Override
	public User updateUser(User user) {
		return userDAO.updateUser(user);
	}
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
