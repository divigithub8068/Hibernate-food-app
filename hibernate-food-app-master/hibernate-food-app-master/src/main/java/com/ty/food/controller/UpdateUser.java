package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class UpdateUser {
	public static void main(String[] args) {

		UserService userService = new UserService();
		User user = userService.getUserServiceById(1);
		user.setName("Raju");
		user.setEmail("raju@mail.com");
		user.setPassword("raju123");
		user.setPhone(984898765);

		User user1 = userService.updateUserService(user);
		if (user1 != null) {
			System.out.println("Update successfully");
		} else {
			System.out.println("No data is found");
		}
	}
}
