package com.ty.food.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.dto.Menu;
import com.ty.food.service.FoodOrderService;
import com.ty.food.service.MenuService;

public class SaveFoodOreder {
	public static void main(String[] args) {
		MenuService menuService = new MenuService();
		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setName("Raju");
		foodOrder.setPhone(9876);
		
		Item item = new Item();
		item.setName("Dosa");
		item.setCost(35);
		item.setQuantity(1);
		item.setFoodOrder(foodOrder);

		Item item2 = new Item();
		item2.setName("Puri");
		item2.setCost(35);
		item2.setQuantity(2);
		item2.setFoodOrder(foodOrder);
		
		Item item3 = new Item();
		item3.setName("Burgar");
		Menu menu = menuService.getMenuByItemId(100);
		double off2 = menu.getOffer();
		double off = 150-((off2/100)*150);
		item3.setCost(off);
		item3.setQuantity(1);
		item3.setFoodOrder(foodOrder);

		List<Item> list = new ArrayList<Item>();
		list.add(item);
		list.add(item2);
		list.add(item3);

		foodOrder.setItem(list);
		FoodOrderService foodOrderService = new FoodOrderService();
		FoodOrder foodOrder2 = foodOrderService.saveFoodOrderService(foodOrder);
		if (foodOrder2 != null) {
			System.out.println("Inserted Successfully");
		} else {
			System.out.println("No data is found");
		}
	}
}
