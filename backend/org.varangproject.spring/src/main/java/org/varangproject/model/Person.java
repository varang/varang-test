package org.varangproject.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "varang_person")
public class Person extends org.varangproject.model.Entity implements
		Serializable {

	private static final long serialVersionUID = 2139912500340286045L;

	private String firstName;
	private String lastName;
	private Short age;
	
	
	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
