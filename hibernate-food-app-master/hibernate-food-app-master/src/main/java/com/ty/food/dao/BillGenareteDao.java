package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.BillGenarate;
import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;

public class BillGenareteDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public BillGenarate getBillGenarate(BillGenarate billGenarate)
	{
		entityTransaction.begin();
		entityManager.persist(billGenarate);
		entityTransaction.commit();
		return billGenarate;
	}
	public BillGenarate getBillGenarateById(int id)
	{
		return entityManager.find(BillGenarate.class, id);
	}
	public List<BillGenarate> getAllBillGenarate()
	{
		Query query = entityManager.createQuery("select f from BillGenarate f");
		return query.getResultList();
	}
	public BillGenarate deleteBillGenarateById(int id)
	{
		BillGenarate billGenarate  = entityManager.find(BillGenarate.class, 1);
		entityTransaction.begin();
		entityManager.remove(billGenarate);
		entityTransaction.commit();
		return billGenarate;
	}
	public BillGenarate updateBillGenarate(BillGenarate billGenarate)
	{
		BillGenarate billGenarate1 = entityManager.find(BillGenarate.class, billGenarate.getId());
		entityTransaction.begin();
		entityManager.merge(billGenarate1);
		entityTransaction.commit();
		return billGenarate1;
	}
}
