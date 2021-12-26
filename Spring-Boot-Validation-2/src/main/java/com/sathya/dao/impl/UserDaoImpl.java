package com.sathya.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sathya.bean.Country;
import com.sathya.bean.Gender;
import com.sathya.bean.RegisterBean;
import com.sathya.dao.IUserDao;
import com.sathya.mapper.CountryMapper;
@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Country> getAllCountries() {
		System.out.println("i m from daoimpl");
		List<Country> countriesList=jdbcTemplate.query("select * from country",new CountryMapper());
		System.out.println(countriesList);
		return countriesList;

	}
	public boolean saveUsers(RegisterBean bean)
	{
		String username=bean.getUsername();
		String email=bean.getEmail();
		int age=bean.getAge();
		Gender gender=bean.getGender();
		String country=bean.getCountry();

		System.out.println("from daoimpl:"+country);
		java.util.Date d1=bean.getDob();
		System.out.println("java utill:"+d1);
		System.out.println(d1.getTime());
		java.sql.Date d2=new java.sql.Date(d1.getTime());
		System.out.println("from daoimpl date:"+d2);
		String genderValue="";
		System.out.println("gender:"+gender);
		if(gender==Gender.MALE)
		{
			genderValue="M";
		}
		else if(gender==Gender.FEMALE)
		{
			genderValue="F";
		}
		else
		{
			genderValue="OTH";
		}
		System.out.println("gender value:"+genderValue);
		try {
			System.out.println("i m from true");
			jdbcTemplate.update("insert into registered_users values(?,?,?,?,?,?)",username,email,age,d2,genderValue,country);
			System.out.println();
			return true;
		}catch(Exception e)
		{
			System.out.println("i m from false");
			return false;

		}
	}

}
