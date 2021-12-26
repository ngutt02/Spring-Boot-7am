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
		tap.authorizeRequests().antMatchers("/index**","/update**","/delete**","/save**","/addEmployee","/listEmployees**","/search**").hasAnyRole("ADMIN")
		.anyRequest().permitAll()
		.and()
		//.httpBasic()
		.formLogin()


		/* code for customized login page*/
		.loginPage("/login").loginProcessingUrl("/login")
		.failureUrl("/login?msg=Bad Credentials")

		/*code for acceddDenied page when user is authenticated but not authorized */
		.and().exceptionHandling().accessDeniedPage("/accessDenied")
		.and()
		.logout().logoutUrl("/logout").logoutSuccessUrl("/loggedout").permitAll()
		.and()
		.csrf().disable();
		//code to add Remember me checkbox
		tap
		.rememberMe()
		.key("myUniqueKey")		
		.rememberMeCookieName("websparrow-login-remember-me")
		.tokenValiditySeconds(10000000);

		//SessionManagement code within single browser
		tap.sessionManagement().maximumSessions(1);


		/*
		 * enable  https protocol
		 */
		tap.requiresChannel().anyRequest().requiresSecure();

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
	public BCryptPasswordEncoder encode()
	{

		return new BCryptPasswordEncoder();
	}


	@Bean
	public  DataSource   dataSource() {
		DriverManagerDataSource   ds =new  DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}

}
