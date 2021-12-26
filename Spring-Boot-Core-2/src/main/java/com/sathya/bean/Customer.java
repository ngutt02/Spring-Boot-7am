package com.sathya.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Customer {
	@Value("${customer.name}")
	private String customerName;
	@Value("${customer.age}")
	private int age;
	@Value("${customer.city}")
	private String city;

	public String toString()
	{
		return "Customer[customername:"+customerName+",age:"+age+",city:"+city+"]";
	}


}
