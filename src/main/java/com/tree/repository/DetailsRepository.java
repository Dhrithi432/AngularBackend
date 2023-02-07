package com.tree.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.tree.model.Details;

public interface DetailsRepository extends CrudRepository<Details, Integer> {

	@Transactional
	void deleteByEmployeeId(int employeeId);
}
