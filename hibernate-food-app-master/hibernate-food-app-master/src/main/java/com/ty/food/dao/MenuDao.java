package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Menu;

public class MenuDao
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Menu saveMenu(Menu menu)
	{
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		return menu;
	}
	public String  getItemNameById(int itemId)
	{
		Menu menu = entityManager.find(Menu.class, itemId);
		return menu.getName();
	}
	public List<Menu> getAllMenu()
	{
		String sql = "select u from User u";
		
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
	public Menu deleteMenuById(int id)
	{
		Menu menu = entityManager.find(Menu.class, id);
		entityTransaction.begin();
		entityManager.remove(menu);
		entityTransaction.commit();
		return menu;
	}
	public Menu updateMenu(Menu menu)
	{
		Menu menu1 = entityManager.find(Menu.class, menu.getItemId());
		entityTransaction.begin();
		entityManager.merge(menu);
		entityTransaction.commit();
		return menu1;
	}
	public Menu getMenuByItemId(int itemid)
	{
		return entityManager.find(Menu.class, itemid);
	}
}