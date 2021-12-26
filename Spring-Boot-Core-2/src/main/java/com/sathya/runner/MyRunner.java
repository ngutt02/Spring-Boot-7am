package com.sathya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.sathya.bean.Customer;
@Component
@Order(1)
public class MyRunner implements CommandLineRunner {
	@Autowired
	ApplicationContext ctx;
	public void run(String... args) throws Exception {
		Customer customer=ctx.getBean("customer",Customer.class);
		System.out.println(customer);


	}

}
