package com.pack.ems.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	private BCryptPasswordEncoder encoder;

	public void configure(HttpSecurity tap)throws Exception
	{
		tap.authorizeRequests().antMatchers("/delete**").hasAnyRole("ADMIN")
		.anyRequest().permitAll()
		.and()
		.httpBasic()
		//.formLogin()
		.and()
		.csrf().disable();
	}
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication().withUser("scott").password(encoder.encode("sathya")).roles("ADMIN")
		.and().withUser("shekher").password(encoder.encode("1234")).roles("MANAGER");
	}
	@Bean
	public BCryptPasswordEncoder getEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
