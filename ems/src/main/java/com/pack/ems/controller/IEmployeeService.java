package com.pack.ems.controller;

import com.pack.ems.entity.Employee;

public interface IEmployeeService {

	
	
	public void saveEmployee(Employee emp);

	boolean doSomething(Integer empNo);
}
