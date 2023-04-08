package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class GetMenuById {
	public static void main(String[] args) {
		MenuService menuService = new MenuService();
		Menu menu = menuService.getMenuByItemId(1);
		if (menu != null) {
			System.out.println(menu);
		}else {
			System.out.println("no menu");
		}
	}
}
