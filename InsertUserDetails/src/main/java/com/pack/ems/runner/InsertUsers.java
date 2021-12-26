package com.pack.ems.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
@Component
public class InsertUsers implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("from run");
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String pwd1=encoder.encode("boot@123");
		String pwd2=encoder.encode("sathya@123");
		String user1="scott";
		String user2="james";
		System.out.println("from runner");
		int i=jdbcTemplate.update("insert into users values(?,?,?)",user1,pwd1,1);
		int j=jdbcTemplate.update("insert into users values(?,?,?)",user2,pwd2,0);
		System.out.println("from after run");
		System.out.println(i);
	}



}
