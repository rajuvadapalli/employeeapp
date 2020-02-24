package com.example.employeeapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	//CRUD operations
	
	//Create - Post
	//Retrive - Get
	//Update - Put
	//Delete - Delete
	
	@Autowired
	EmployeeService empservice;
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee emp) {
		
		return empservice.addEmployee(emp);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		
		return empservice.getEmployees();
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee emp) {
		
		return empservice.updateEmployee(emp);
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable String id) {
		
		return empservice.deleteEmployee(id);
	}
	

}
