package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class TestDeleteMenuById {
	public static void main(String[] args) {
		MenuService menuService = new MenuService();
		Menu flag = menuService.deleteMenuById(2);
		if (flag != null) {
			System.out.println("Deleted");
		}else {
			System.out.println("no memu");
		}
	}
}
