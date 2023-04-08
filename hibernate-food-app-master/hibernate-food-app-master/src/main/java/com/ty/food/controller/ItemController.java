package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.ItemService;

public class ItemController {
	public static void main(String[] args) {
//		FoodOrder foodOrder = new FoodOrder();
//		foodOrder.setName("Raju");
//		foodOrder.setPhone(987643);
//		foodOrder.setTotal(0);
//		
//		Item item = new Item();
//		item.setName("IDli");
//		item.setCost(10);
//		item.setQuantity(1);
//		item.setFoodOrder(foodOrder);
//		
		ItemService itemService = new ItemService();
//		Item item1 = itemService.saveItemService(item);
//		if(item1 != null)
//		{
//			System.out.println("Inserted Successfully");
//		}
//		else
//		{
//			System.out.println("No data is Found");
//		}

//		Item item = itemService.getItemServiceById(1);
//		if(item != null)
//		{
//			System.out.println("Item  id:"+item.getId());
//			System.out.println("Item  Name:"+item.getName());
//			System.out.println("Item  Cost:"+item.getCost());
//			System.out.println("Item  Quantity:"+item.getQuantity());
//			System.out.println("---------------------------------------------");
//			
//			FoodOrder foodOrder = item.getFoodOrder();
//			System.out.println("FoodOrder  Id:"+foodOrder.getId());
//			System.out.println("FoodOrder  Name:"+foodOrder.getName());
//			System.out.println("FoodOrder  Phone:"+foodOrder.getPhone());
//			System.out.println("FoodOrder  Total:"+foodOrder.getTotal());
//			System.out.println("---------------------------------------");
//		}

//		List<Item> list = itemService.getAllItemService();
//		for(Item item:list)
//		{
//			System.out.println("Item  id:"+item.getId());
//			System.out.println("Item  Name:"+item.getName());
//			System.out.println("Item  Cost:"+item.getCost());
//			System.out.println("Item  Quantity:"+item.getQuantity());
//			System.out.println("---------------------------------------------");
//			
//			FoodOrder foodOrder = item.getFoodOrder();
//			if(foodOrder != null) {
//			System.out.println("FoodOrder  Id:"+foodOrder.getId());
//			System.out.println("FoodOrder  Name:"+foodOrder.getName());
//			System.out.println("FoodOrder  Phone:"+foodOrder.getPhone());
//			System.out.println("FoodOrder  Total:"+foodOrder.getTotal());
//			System.out.println("---------------------------------------");
//			}
//		}

		Item item = itemService.deleteItemServiceById(2);
		if (item != null) {
			System.out.println("Deleted Successfully");
		} else {
			System.out.println("No data is Found");
		}
	}
}
