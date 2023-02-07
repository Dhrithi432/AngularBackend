package com.tree.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Employees")
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String mainbranch;
//	@OneToMany(targetEntity = Details.class,cascade=CascadeType.ALL)
//	@JoinColumn(name="employeeFK",referencedColumnName="employeeId")
	@OneToMany(targetEntity = Details.class,mappedBy = "employees",cascade=CascadeType.ALL)
	private List<Details> childOfMainBranch;
		
	public String getMainbranch() {
		return mainbranch;
	}

	public void setMainbranch(String mainbranch) {
		this.mainbranch = mainbranch;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public List<Details> getChildOfMainBranch() {
		return childOfMainBranch;
	}

	public void setChildOfMainBranch(List<Details> childOfMainBranch) {
		this.childOfMainBranch = childOfMainBranch;
	}

	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", mainbranch=" + mainbranch + ", childOfMainBranch="
				+ childOfMainBranch + "]";
	}

	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(int employeeId, String mainbranch, List<Details> childOfMainBranch) {
		super();
		this.employeeId = employeeId;
		this.mainbranch = mainbranch;
		this.childOfMainBranch = childOfMainBranch;
	}
		
	
}
