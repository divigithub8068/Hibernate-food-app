package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.Item;

public class ItemDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Item saveItem(Item item)
	{
		entityTransaction.begin();
		entityManager.persist(item);
		entityManager.persist(item.getFoodOrder());
		entityTransaction.commit();
		return item;
	}
	public Item getItemById(int id)
	{
		return entityManager.find(Item.class, id);
	}
	public List<Item> getAllItem()
	{
		Query query = entityManager.createQuery("select i from Item i");
		return query.getResultList();
	}
	public Item deleteItemById(int id)
	{
		Item item = entityManager.find(Item.class, id);
		
		entityTransaction.begin();
		entityManager.remove(item);
		entityTransaction.commit();
		return item;
	}
}
