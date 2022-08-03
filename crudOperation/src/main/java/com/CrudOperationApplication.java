package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationApplication.class, args);
	}
	
	/*
	 * dependenciea ro be added
	 * 1. spring boot web -> rest api support
	 * 2. mysql driver
	 * 3. spring-data-jpa -> to interact with DB (internally uses hibernate for jpa provider)
	 * 4. lambok -> reduce boiler plate code to create getter setter
	 * 
	 * open mysql workbench and create a new database
	 * 
	 * create database emp_management;
	 * 
	 * refresh the schemas then new database will be visible
	 *jdbc driver,jdbc url,username,password is requires
	 *
	 *create entity class Employee in dto
	 *create EmployeeRepository interface
	 *
	 *create custom exception -- resource not found with given id
	 *
	 *create EmployeeService Interface
	 *create EmployeeServiceImple whuch implements this
	 *c
	 */
}
