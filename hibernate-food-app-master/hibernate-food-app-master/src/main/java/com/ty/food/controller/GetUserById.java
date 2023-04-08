package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class GetUserById {
	public static void main(String[] args) {
		UserService userService = new UserService();
		
		User user = userService.getUserServiceById(2);
		if(user != null)
		{
			System.out.println("User  id  : "+user.getId());
			System.out.println("User  Name : "+user.getName());
			System.out.println("User  Email: "+user.getEmail());
			System.out.println("User  Password: "+user.getPassword());
			System.out.println("User  Phone: "+user.getPhone());
		}
		else
		{
			System.out.println("No data is found");
		}
	}
}
