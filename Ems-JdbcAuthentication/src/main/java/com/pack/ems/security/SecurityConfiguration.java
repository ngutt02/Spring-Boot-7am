package com.pack.ems.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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
		//.httpBasic()
		.formLogin()
		.and()
		.csrf().disable();
	}
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
	{
		/*auth.inMemoryAuthentication().withUser("scott").password(encoder.encode("sathya")).roles("ADMIN")
		.and().withUser("shekher").password(encoder.encode("1234")).roles("ADMIN");*/

		auth.jdbcAuthentication().dataSource(dataSource())
		.usersByUsernameQuery("select username, password, enabled"
				+ " from users where username=?")
		.authoritiesByUsernameQuery("select username, authority "
				+ "from authorities where username=?")
		.passwordEncoder(encoder);



	}
	@Bean
	public BCryptPasswordEncoder getEncoder()
	{
		return new BCryptPasswordEncoder();
	}

	@Bean
	public  DataSource   dataSource() {
		System.out.println("hiiii");
		DriverManagerDataSource   ds =new  DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}

}
