package com.pack.ems.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pack.ems.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
	

	
	public List<com.pack.ems.entity.Employee> findByDeptNo(Integer deptNo);
	
}
