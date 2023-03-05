package com.vishal.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.code.bean.Employee;
import com.vishal.code.service.EmployeeServiceImp;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImp employeeServiceImp;
	
	@GetMapping("/")
	public void getAllEmployeeRecords() {
		
	} 
	
	@PostMapping("/add")
	public void addEmployeeRecords(@RequestBody Employee employee) {
		employeeServiceImp.addEmployeeDetails(employee);
	} 
}
