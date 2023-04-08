package com.ty.food.service;

import java.util.List;

import com.ty.food.dao.MenuDao;
import com.ty.food.dto.Menu;

public class MenuService {

	MenuDao menuDao = new MenuDao();

	public Menu saveMenu(Menu menu) {
		return menuDao.saveMenu(menu);
	}

	public String getItemNameById(int id) {
		return menuDao.getItemNameById(id);
	}

	public Menu deleteMenuById(int id) {
		return menuDao.deleteMenuById(id);
	}

	public List<Menu> getAllMenu() {
		return menuDao.getAllMenu(); 
	}
	
	public Menu updateMenu(Menu menu) {
		return menuDao.updateMenu(menu);
	}

	public Menu getMenuByItemId(int itemId) {
		return menuDao.getMenuByItemId(itemId);
	}
	
}
