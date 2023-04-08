package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class DeleteUser {
	public static void main(String[] args) {
		UserService userService = new UserService();
		User user = userService.deleteUserService(2);
		if(user != null)
		{
			System.out.println("Deleted successfully");
		}
		else {
			System.out.println("No data is found");
		}
	}
}
