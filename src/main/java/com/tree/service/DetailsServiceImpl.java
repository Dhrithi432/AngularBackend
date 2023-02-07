package com.tree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tree.repository.DetailsRepository;

@Service
public class DetailsServiceImpl implements DetailsService {
	
	@Autowired
	DetailsRepository detailsRepository;

	@Override
	public void deleteDetails(int empId) {
		// TODO Auto-generated method stub
		detailsRepository.deleteById(empId);	
	}

}
