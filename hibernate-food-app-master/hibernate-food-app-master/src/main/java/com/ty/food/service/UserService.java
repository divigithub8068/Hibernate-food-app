package com.ty.food.service;

import java.util.List;

import com.ty.food.dao.UserDao;
import com.ty.food.dto.User;

public class UserService {
	UserDao userDao = new UserDao();
	public User saveUserService(User user)
	{
		return userDao.saveUser(user);
	}
	public User getUserServiceById(int id)
	{
		return userDao.getUserById(id);
	}
	public List<User> getAllUserService()
	{
		return userDao.getAllUser();
	}
	public User deleteUserService(int id)
	{
		return userDao.deleteUser(id);
	}
	public List<User> validateUserService(String email,String password)
	{
		return userDao.validateUser(email, password);
	}
	public User updateUserService(User user)
	{
		return userDao.upadateUser(user);
	}
}
