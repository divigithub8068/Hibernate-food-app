package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.User;

public class UserDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public User saveUser(User user)
	{
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}
	public User getUserById(int id)
	{
		return entityManager.find(User.class, id);
	}
	public List<User> getAllUser()
	{
		String sql = "select u from User u";
		
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
	public User deleteUser(int id)
	{
		User user = entityManager.find(User.class, id);
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
		return user;
	}
	public List<User> validateUser(String email,String password)
	{
		String sql = "select u from User u where u.email=?1 and u.password=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		return query.getResultList();
	}
	public User upadateUser(User user)
	{
		User user1 = entityManager.find(User.class,user.getId());
		entityTransaction.begin();
		entityManager.merge(user1);
		entityTransaction.commit();
		return user1;
	}
}
