package com.tree.service;

import java.util.List;
import com.tree.model.Project;

public interface TreeDataService {

	Project createProject(Project project);
	List <Project> getProject();
}
