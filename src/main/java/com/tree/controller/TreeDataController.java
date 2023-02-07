package com.tree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tree.model.Project;
import com.tree.service.TreeDataService;

@CrossOrigin
@RestController
@RequestMapping("ust/v1/")
public class TreeDataController {

	@Autowired
	TreeDataService treeDataService;
	
	@PostMapping("/createProject")
	public Project createProject(@RequestBody Project project) {
		return treeDataService.createProject(project);
	}
	
	@GetMapping("/getProject")
	public List<Project> getProject(){
		return treeDataService.getProject();
	}
}
