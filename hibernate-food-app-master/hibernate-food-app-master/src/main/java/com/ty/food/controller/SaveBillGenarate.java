package com.ty.food.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.food.dto.BillGenarate;
import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.BillGenarateService;
import com.ty.food.service.FoodOrderService;

public class SaveBillGenarate {
	
	public static void main(String[] args) {
		BillGenarateService billGenarateService = new BillGenarateService();
		FoodOrderService foodOrderService = new FoodOrderService();
		BillGenarate billGenarate = new BillGenarate();
			
		List<FoodOrder> list= foodOrderService.getFoodOrderServiceByPhoneAndName("Raju",9876);
		for(FoodOrder foodOrder : list) {
			List<Item> list2 = foodOrder.getItem();
			for(Item item : list2)
			{
				String name = item.getName();
				billGenarate.setItem(name);
				double amt =item.getCost();
				billGenarate.setCost(amt);
				int quantity = item.getQuantity();
				billGenarate.setQuantity(quantity);
				double total = amt * quantity;
				billGenarate.setTotal(total);
			}
		}
		
		
	}
	
}
