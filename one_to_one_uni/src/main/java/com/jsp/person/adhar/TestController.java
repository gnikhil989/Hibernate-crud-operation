package com.jsp.person.adhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Person person= new Person();
		person.setName("nikhil");
		person.setEmail("nikhil@989");
		
		Aadhar aadhar= new Aadhar();
		aadhar.setAdhar_no("21212");
		aadhar.setCity("mumbai");
//		to join person table into aadhar with person id as a foriegn key in  aaadhar table
		aadhar.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(aadhar);
		entityTransaction.commit();
	}

}
