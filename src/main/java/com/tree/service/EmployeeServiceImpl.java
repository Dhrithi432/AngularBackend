package com.tree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tree.model.Employees;
import com.tree.repository.EmployeesRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeesRepository employeesRepository;
	@Override
	public Employees createEmployee(Employees employee) {
		// TODO Auto-generated method stub
		return employeesRepository.save(employee);
	}

}
