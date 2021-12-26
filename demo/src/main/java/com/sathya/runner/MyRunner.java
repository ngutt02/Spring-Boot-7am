package com.sathya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.sathya.bean.HelloBean;
@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	private ApplicationContext ctx;

	public void run(String... args) throws Exception {
		HelloBean helloBean=ctx.getBean("helloBean",HelloBean.class);

		System.out.println(helloBean.sayHello());
	}

}
