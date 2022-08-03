package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Employee;

// internally adds @Repository annotation to EmployeeRepository Interface as it extends JpaRepository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	//Employee is Dto class & Long is data type of primary key

}
