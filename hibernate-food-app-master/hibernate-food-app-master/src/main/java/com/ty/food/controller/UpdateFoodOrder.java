package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.service.FoodOrderService;

public class UpdateFoodOrder {
	public static void main(String[] args) {
		
		FoodOrderService foodOrderService = new FoodOrderService();
		
		List<FoodOrder> list= foodOrderService.getFoodOrderServiceByPhoneAndName("raju",98765432);
		for(FoodOrder foodOrder : list) {
		FoodOrder foodOrder1 = foodOrderService.updateFoodOrderService(foodOrder);
		if(foodOrder1 != null)
		{
			System.out.println("Update successfully");
		} else {
			System.out.println("no data is found");
		}
		}
	}
}
