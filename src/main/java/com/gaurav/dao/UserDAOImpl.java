package com.gaurav.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gaurav.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		return sessionFactory.getCurrentSession().createQuery("from User")
				.list();
	}

	@Override
	public User updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
		return user;
	}

	@Override
	public User getUser(String userEmail) {
		return (User) sessionFactory.getCurrentSession().get(
				User.class, userEmail);
	}

}
