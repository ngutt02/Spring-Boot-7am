package com.sathya.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(2)
public class MyRunner2 implements ApplicationRunner {


	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Non-Optional Arguments:"+args.getNonOptionArgs());
		System.out.println("Option Arguments Names:"+args.getOptionNames());
		for(String optionalNames:args.getOptionNames())
		{
			System.out.println("Optional Arguments:"+args.getOptionValues(optionalNames));
		}

	}

}
