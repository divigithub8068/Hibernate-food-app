package com.ty.food.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class ValidateUser {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		UserService userService = new UserService();
		
		list = userService.validateUserService("raju@mail.com", "raju123");
		if(list.size()>0)
		{
			for(User user:list)
			{
				System.out.println("User  id  : "+user.getId());
				System.out.println("User  Name : "+user.getName());
				System.out.println("User  Email: "+user.getEmail());
				System.out.println("User  Password: "+user.getPassword());
				System.out.println("User  Phone: "+user.getPhone());
				System.out.println("-----------------------------------------");
			}
		}
		else
		{
			System.out.println("No data is found");
		}
	}
}
