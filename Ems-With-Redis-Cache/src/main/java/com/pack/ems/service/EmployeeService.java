package com.pack.ems.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.pack.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Cacheable("emps")
	public List<com.pack.ems.entity.Employee> findAllEmps()
	{
		return repository.findAll();	
	}


}
