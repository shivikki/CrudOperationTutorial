package com.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Employee;
import com.exception.ResourceNotFound;
import com.repository.EmployeeRepository;
import com.service.EmployeeService;

//This annotation serves as a specialization of @Component,
//allowing for implementation classes to be autodetected through classpath scanning.
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	
	/*
	 *
	 * The @Autowired annotation marks a Constructor, Setter method, Properties and
	 * Config() method as to be autowired that is ‘injecting beans'(Objects) at
	 * runtime by Spring Dependency Injection
	 * 
	 * 
	 * Autowiring can't be used to inject primitive and string values. It works with
	 * reference only.
	 * 
	 * @Autowired is optional for constructor based dependency injection
	 */
	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println(emp.toString() + " inside impl");
		return employeeRepository.save(emp);
		// save is predefined jpa m/d to save data in db
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmpById(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = employeeRepository.findById(id);
		if (emp.isPresent()) {// check if object present
			return emp.get();
			// get content of Optiona; obj
		} else {
			throw new ResourceNotFound("Employee", "id", id + "");

		}
	}

	@Override
	public Employee updateEmp(Employee emp, long id) {
		//check emp present with given id in db or not
		Optional<Employee> empExist = employeeRepository.findById(id);
		if (empExist.isPresent()) {// check if object present
			empExist.get().setFirstName(emp.getFirstName());
			empExist.get().setLastName(emp.getLastName());
			employeeRepository.save(empExist.get());
			return empExist.get();
			// get content of Optiona; obj
		} else {
			throw new ResourceNotFound("Employee", "id", id + "");

		}
	
	}

	@Override
	public void deleteEmp(long id) {
		Optional<Employee> empExist = employeeRepository.findById(id);
		if (empExist.isPresent()) {// check if object present
			 employeeRepository.deleteById(id);
	
			// get content of Optiona; obj
		} else {
			throw new ResourceNotFound("Employee", "id", id + "");

		}
		
	}

	/*
	 * 2 types of dependency injection -> setter bases dependency injection - when
	 * optional parameter -> constructor bases dependency injection - when mandatory
	 * paramemters
	 */

}
