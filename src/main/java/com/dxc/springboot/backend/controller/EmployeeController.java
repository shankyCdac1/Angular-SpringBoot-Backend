package com.dxc.springboot.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.springboot.backend.model.Employee;
import com.dxc.springboot.backend.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")

public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@GetMapping("/employees")
	@CrossOrigin(origins = "https://localhost:4200")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	@PostMapping("/employees")
	@CrossOrigin(origins ="https://localhost:4200")
	public Employee createEmployees(@RequestBody Employee emp) {
		return employeeRepository.save(emp);
	}
}
