package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.dto.Employee;
import com.service.EmployeeService;

@RestController //@RequestMapping("/api/employees/")
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	//constructor bases dependency injection

	
	//rest api, responseEnity used so that we can set staus,msg of response
	//create new employee
	@PostMapping("/saveEmp")
	public Employee saveEmployee(@RequestBody Employee emp){
		//@RequestBody allows us to retrive the request body and automatically convert it to java object
		System.out.println(emp.toString());
//		emp.setFirstName("shivangi");
//		emp.setLastName("shivangi");
		//.return new ResponseEntity<Employee>(this.employeeService.saveEmployee(emp),HttpStatus.CREATED);
				//1st arg is object 2nd is HTTP status
		employeeService.saveEmployee(emp);
		return emp;
		
	}
	
	//get list of all emo
	
	
	//get all employees list
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	//get emp by id
	@PostMapping("/getEmp/{id}")
	public Employee getEmpById(@PathVariable long id) {
		return employeeService.getEmpById(id);
	}
	
	//update emp rest api
	@PutMapping("/updateEmp/{id}")
	public Employee getEmpById(@PathVariable long id,@RequestBody Employee emp) {
		return employeeService.updateEmp(emp,id);
	}
	
	//delete emp rest api
	@DeleteMapping("/deleteEmp/{id}")
	public void  deleteEmp(@PathVariable long id) {
		 employeeService.deleteEmp(id);
	}
	
	
}
