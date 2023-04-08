package com.ty.food.service;

import java.util.List;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.dto.Menu;

import static com.ty.food.util.Tax.*;

public class FoodOrderService {
	FoodOrderDao dao = new FoodOrderDao();

	public FoodOrder saveFoodOrderService(FoodOrder foodOrder) {
		double sum = 0;
		/*
		 * List<FoodOrder> list = dao.getFoodOrderByPhoneAndName(foodOrder.getName(),
		 * foodOrder.getPhone()); for (FoodOrder food : list) { List<Item> list2 =
		 * food.getItem(); for (Item item : list2) { double sum1 = item.getCost() *
		 * item.getQuantity(); sum += sum1; } }
		 */

		List<Item> list = foodOrder.getItem();
		for (Item item : list) {
				double sum1 = item.getCost() * item.getQuantity();
				sum += sum1;
		}
		double price1 = (CGST / 100) * sum;
		double price2 = (SGST / 100) * sum;
		double price3 = sum + price1 + price2;
		foodOrder.setTotal(price3);
		return dao.saveFoodOrder(foodOrder);

	}

	public List<FoodOrder> getFoodOrderServiceByPhoneAndName(String name, long phone) {
		return dao.getFoodOrderByPhoneAndName(name, phone);
	}

	public List<FoodOrder> getAllFoodOrderService() {
		return dao.getAllFoodOrder();
	}

	public FoodOrder deleteFoodOrderServiceById(int id) {
		return dao.deleteFoodOrderById(id);
	}

	public FoodOrder updateFoodOrderService(FoodOrder foodOrder) {
		return dao.updateFoodOrder(foodOrder);
	}
}
