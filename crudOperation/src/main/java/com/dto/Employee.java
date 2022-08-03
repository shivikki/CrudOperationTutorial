package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employee")//by default table name is name of class
public class Employee {
	@Id //makes primary key
	@GeneratedValue(strategy=GenerationType.AUTO)//auto increment id
	private long id;
	
	@Column(name="first_name")//col can not have null values ,nullable=false
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public Employee(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	
	
	
	
	//lombok dependency added @Data creates getter , setter, constructor, toString
	//make java class jpa entity use @Entity
	
	//on running the java program - tables gets created in mysql
	
	
}
