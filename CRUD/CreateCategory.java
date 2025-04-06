package com.code.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.code.entity.Category;
import com.code.entity.Product;

public class CreateCategory {
	private SessionFactory sessionFactory = null;
	public CreateCategory(SessionFactory sessionFactory)
	{
		//set the object
		this.sessionFactory = sessionFactory;
		//Session object using SessionFactory object
		Session session =  sessionFactory.getCurrentSession();
		//start the transaction
		session.beginTransaction();
		//create objects for Category and Product
		Category category1 = new Category("Gaming","Devices including Laptops, Play Stations and many more");
		session.persist(category1);
		System.out.println("Category is created successfully with id " + category1.getId());
		
		//more instances of them
		 Category category2 = new Category("Sports","Goods include Table Tennis Equipments, Cricket Equipments and many more");
	     session.persist(category2);
		 System.out.println("Category is created successfully with id " + category2.getId());
		 
		 Category category3 = new Category("Comics and Books","Items include Marvel and DC Comics, Novels and many more");
	     session.persist(category3);
		 System.out.println("Category is created successfully with id " + category3.getId());
		 //commit
		 session.getTransaction().commit();
		 //close the session object
		 session.close();
	}
}
