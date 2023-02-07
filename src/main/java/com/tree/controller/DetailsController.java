package com.tree.controller;

//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tree.model.Details;
import com.tree.repository.DetailsRepository;
import com.tree.repository.EmployeesRepository;
import com.tree.service.DetailsService;

@CrossOrigin
@RestController
@RequestMapping("ust/v1/")
public class DetailsController {

	@Autowired
	EmployeesRepository employeeRepository;
	
	@Autowired
	DetailsRepository detailsRepository;
	
	@Autowired
	DetailsService detailsService;
	
	@PostMapping("/employees/{employeesId}/createdetails")
	  public ResponseEntity<Details> createDetails(@PathVariable(value = "employeesId") int employeesId,
	      @RequestBody Details detailsRequest) {
//				@SuppressWarnings("unchecked")
				Details detail =  employeeRepository.findById(employeesId).map(employee -> {
					detailsRequest.setEmployees(employee);
					return detailsRepository.save(detailsRequest);
				}).orElseThrow(IllegalArgumentException::new);
			return new ResponseEntity<>(detail, HttpStatus.CREATED);
	  }	
	@DeleteMapping("/deletedetails/{empId}")
	public ResponseEntity<HttpStatus> deleteDetails(@PathVariable(value="empId") int empId) {
		detailsRepository.deleteById(empId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
