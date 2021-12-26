package com.pack.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EmsWithRedisCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsWithRedisCacheApplication.class, args);
	}

}
