package com.ty.food.controller;

import com.ty.food.dto.FoodOrder;
import com.ty.food.service.FoodOrderService;

public class DeleteFoodOrder {

	public static void main(String[] args) {
		FoodOrderService foodOrderService = new FoodOrderService();
		
		FoodOrder foodOrder = foodOrderService.deleteFoodOrderServiceById(1);
		if(foodOrder != null)
		{
			System.out.println("Deleted successfully");
		} else {
			System.out.println("no data is found");
		}
	}

}
