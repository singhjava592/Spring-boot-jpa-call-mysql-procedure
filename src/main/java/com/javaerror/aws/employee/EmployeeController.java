package com.javaerror.aws.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController { 
	
	@Autowired
	private EmployeeDAO dao;

	@GetMapping("/employees")
	public List<Employee> listEmployee() {
		return dao.getEmployeeList();
		
	}
}
