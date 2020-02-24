package com.example.employeeapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	List<Employee> empList=new ArrayList<Employee>();
	
	
	public Employee addEmployee(Employee emp) {
		empList.add(emp);
		return emp;
	}
	
	public Employee updateEmployee(Employee emp) {
		
		for(int i=0;i<empList.size();i++) {
			if(empList.get(i).getId().equals(emp.getId())) {
				empList.get(i).setName(emp.getName());
			}
		}
		return emp;
	}
	
	
	public String deleteEmployee(String id) {
		
		for(int i=0;i<empList.size();i++) {
			if(empList.get(i).getId().equals(id)) {
				empList.remove(i);
			}
		}
		return "success";
	}
	
	public List<Employee> getEmployees() {
		return empList;
	}
}
