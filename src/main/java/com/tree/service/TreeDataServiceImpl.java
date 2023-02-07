package com.tree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tree.model.Project;
import com.tree.repository.ProjectRepository;

@Service
public class TreeDataServiceImpl implements TreeDataService {

	@Autowired
		private ProjectRepository projectRepository;
	
	@Override
	public Project createProject(Project project) {
		// TODO Auto-generated method stub
		return projectRepository.save(project);
	}

	@Override
	public List<Project> getProject() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

}
