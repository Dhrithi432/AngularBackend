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
@Table(name="Project")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;
	
	@Column(name="mainbranch")
	private String mainbranch;
	
	@OneToMany(targetEntity = Department.class,cascade=CascadeType.ALL)
	@JoinColumn(name="projectFK",referencedColumnName="projectId")
	@Column(name="department")
	private List<Department> childOfMainBranch;
	
//Getters and Setters
	
	public int getProjectId() {
		return projectId;
	}
	public String getMainbranch() {
		return mainbranch;
	}
	public void setMainbranch(String mainbranch) {
		this.mainbranch = mainbranch;
	}
	public List<Department> getChildOfMainBranch() {
		return childOfMainBranch;
	}
	public void setChildOfMainBranch(List<Department> childOfMainBranch) {
		this.childOfMainBranch = childOfMainBranch;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	
}
