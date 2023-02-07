package com.tree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tree.model.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

}
