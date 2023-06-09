package com.jsp.person.pancard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pancard_id;
	private String name;
	private String city;
	@OneToOne
	private Person person;
	public int getPancard_id() {
		return pancard_id;
	}
	public void setPancard_id(int pancard_id) {
		this.pancard_id = pancard_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	

}
