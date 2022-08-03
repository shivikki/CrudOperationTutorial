package com.service;

import java.util.List;

import com.dto.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee emp);
	
	List<Employee> getAllEmployee();
	
	Employee getEmpById(long id);
	
	Employee updateEmp(Employee emp,long id);
	
	void deleteEmp(long id);
}
