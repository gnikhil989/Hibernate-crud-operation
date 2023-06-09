package com.jsp.hospital.branches;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		
		Hospital hospital= new Hospital();
		hospital.setHname("Fortis");
		hospital.setGst("FST234353252");
		
		Branch b1 = new Branch();
		b1.setBcity("MUMBAI");
		
		Branch b2 = new Branch();
		b2.setBcity("NAVI MUBAI");
		
		Branch b3 = new Branch();
		b3.setBcity("BANARAS");
		
		ArrayList<Branch> branches = new ArrayList<Branch>();
		branches.add(b1);
		branches.add(b2);
		branches.add(b3);
		
		hospital.setBranches(branches);
		
		 entityTransaction.begin();
		 entityManager.persist(hospital);
		 entityManager.persist(b1);
		 entityManager.persist(b2);
		 entityManager.persist(b3);
		 entityTransaction.commit();
		
		
	}

}
