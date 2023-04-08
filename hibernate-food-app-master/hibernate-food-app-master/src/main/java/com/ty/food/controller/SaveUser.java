package com.ty.food.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class SaveUser {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setName("Ramu");
		user.setEmail("ramu@mail.com");
		user.setPassword("ram123");
		user.setPhone(984456789);

		UserService userService = new UserService();
		User user1 = userService.saveUserService(user);
		if (user1 != null) {
			System.out.println("inserted is successfully");
		} else {
			System.out.println("No data is addedd");
		}
	}
}
