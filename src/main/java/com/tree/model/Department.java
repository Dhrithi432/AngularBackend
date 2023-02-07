package com.tree.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="departmentId")
	private int departmentId;
	
	@Column(name="name")
	private String mainbranch;
	
	@OneToMany(targetEntity = Employees.class,cascade=CascadeType.ALL)
	@JoinColumn(name="departmentFK",referencedColumnName="departmentId")
	private List<Employees> childOfMainBranch;
		
//getters and setters
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getMainbranch() {
		return mainbranch;
	}
	public void setMainbranch(String mainbranch) {
		this.mainbranch = mainbranch;
	}
	public List<Employees> getChildOfMainBranch() {
		return childOfMainBranch;
	}
	public void setChildOfMainBranch(List<Employees> childOfMainBranch) {
		this.childOfMainBranch = childOfMainBranch;
	}
	
	
	

}
