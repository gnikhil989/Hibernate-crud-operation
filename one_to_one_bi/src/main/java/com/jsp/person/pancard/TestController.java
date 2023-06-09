package com.jsp.person.pancard;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		
		Person person= new Person();
		person.setName("nikhil");
		person.setCity("mumbai");
		
		Pancard pancard = new Pancard();
		pancard.setName("nikhil");
		pancard.setCity("baNARAS");
		
		pancard.setPerson(person);
		person.setPancard(pancard);
		entityTransaction.begin();
		entityManager.persist(pancard);
		entityManager.persist(person);
		entityTransaction.commit();

	}

}
