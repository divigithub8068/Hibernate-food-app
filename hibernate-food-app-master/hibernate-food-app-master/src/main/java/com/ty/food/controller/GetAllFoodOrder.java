package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class GetAllFoodOrder {
	public static void main(String[] args) {
		FoodOrderService foodOrderService = new FoodOrderService();
		
		List<FoodOrder> list = foodOrderService.getAllFoodOrderService();
		for(FoodOrder foodOrder : list)
		{
			System.out.println("FoodOrder  Id:"+foodOrder.getId());
			System.out.println("FoodOrder  Name:"+foodOrder.getName());
			System.out.println("FoodOrder  Phone:"+foodOrder.getPhone());
			System.out.println("FoodOrder  Total:"+foodOrder.getTotal());
			System.out.println("---------------------------------------");
			List<Item> list1= foodOrder.getItem();
			for(Item item :list1)
			{
				System.out.println("Item  id:"+item.getId());
				System.out.println("Item  Name:"+item.getName());
				System.out.println("Item  Cost:"+item.getCost());
				System.out.println("Item  Quantity:"+item.getQuantity());
				System.out.println("---------------------------------------------");
			}
		}
	}
}
