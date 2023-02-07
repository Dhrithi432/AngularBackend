package com.tree.model;

import java.util.List;

import javax.persistence.CascadeType;

//import java.util.List;

//import java.util.List;
//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Details")
public class Details {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int empId;
	private String name;
	private String employeeId;
	private String designation;
	private String dateOfJoining;
	
	@ManyToOne(targetEntity= Employees.class,cascade=CascadeType.PERSIST)
	@JoinColumn(name="employee_fk")
	@JsonIgnore
	private Employees employees;
//	private List<Employees> employees;
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
//	public List<Employees> getEmployees() {
//		return employees;
//	}
//	public void setEmployees(List<Employees> employees) {
//		this.employees = employees;
//	}
	

public Details() {
	// TODO Auto-generated constructor stub
}
//public Employees getEmployees() {
//	return employees;
//}
//public void setEmployees(Employees employees) {
//	this.employees = employees;
//}
public Employees getEmployees() {
	return employees;
}
public void setEmployees(Employees employees) {
	this.employees = employees;
}
@Override
public String toString() {
	return "Details [empId=" + empId + ", name=" + name + ", employeeId=" + employeeId + ", designation=" + designation
			+ ", dateOfJoining=" + dateOfJoining + ", employees=" + employees + "]";
}
public Details(int empId, String name, String employeeId, String designation, String dateOfJoining,
		Employees employees) {
	super();
	this.empId = empId;
	this.name = name;
	this.employeeId = employeeId;
	this.designation = designation;
	this.dateOfJoining = dateOfJoining;
	this.employees = employees;
}








	
	
}
