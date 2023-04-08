package com.ty.food.service;

import java.util.List;

import com.ty.food.dao.ItemDao;
import com.ty.food.dto.Item;
import com.ty.food.dto.Menu;

public class ItemService {
	ItemDao dao = new ItemDao();
	public Item saveItemService(Item item)
	{
		return dao.saveItem(item);
	}
	public Item getItemServiceById(int id)
	{
		return dao.getItemById(id);
	}
	public List<Item> getAllItemService()
	{
		return dao.getAllItem();
	}
	public Item deleteItemServiceById(int id)
	{
		return dao.deleteItemById(id);
	}
}
