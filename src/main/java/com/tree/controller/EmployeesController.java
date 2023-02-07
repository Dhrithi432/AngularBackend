package com.tree.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tree.model.Employees;
import com.tree.repository.EmployeesRepository;
import com.tree.service.EmployeeService;

@CrossOrigin
@RestController
@RequestMapping("ust/v1/")
public class EmployeesController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	EmployeesRepository employeeRepository;
	
	@PostMapping("/createmployees")
	public Employees createEmployee(@RequestBody Employees employee) {
		return employeeService.createEmployee(employee);
	}
	
//	@GetMapping("/employees/{id}")
//	public ResponseEntity<Optional<Employees>> getEmployeeById(@PathVariable(value = "id") int empId) {
//	        Optional<Employees> employee = employeeRepository.findById(empId);
//	        return ResponseEntity.ok().body(employee);
//	}
}
