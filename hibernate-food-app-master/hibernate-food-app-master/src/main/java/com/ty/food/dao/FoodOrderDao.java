package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;

public class FoodOrderDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public FoodOrder saveFoodOrder(FoodOrder foodOrder)
	{
		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityTransaction.commit();
		return foodOrder;
	}
	public List<FoodOrder> getFoodOrderByPhoneAndName(String name,long phone)
	{
		String sql = "select f from FoodOrder f where f.name=?1 and f.phone=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		query.setParameter(2, phone);
		return query.getResultList();
	}
	public List<FoodOrder> getAllFoodOrder()
	{
		Query query = entityManager.createQuery("select f from FoodOrder f");
		return query.getResultList();
	}
	public FoodOrder deleteFoodOrderById(int id)
	{
		FoodOrder foodOrder  = entityManager.find(FoodOrder.class, 1);
		entityTransaction.begin();
		entityManager.remove(foodOrder);
		entityTransaction.commit();
		return foodOrder;
	}
	public FoodOrder updateFoodOrder(FoodOrder foodOrder)
	{
		FoodOrder foodOrder1  = entityManager.find(FoodOrder.class, foodOrder.getId());
		entityTransaction.begin();
		entityManager.merge(foodOrder1);
		entityTransaction.commit();
		return foodOrder1;
	}
}
