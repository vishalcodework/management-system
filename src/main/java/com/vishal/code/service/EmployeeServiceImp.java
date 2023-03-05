package com.vishal.code.service;

import org.springframework.stereotype.Service;

import com.vishal.code.bean.Employee;
import com.vishal.code.repo.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImp (EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public void addEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		
	}

}
