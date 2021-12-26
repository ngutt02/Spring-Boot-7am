package com.sathya.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sathya.bean.Country;
import com.sathya.dao.IUserDao;
import com.sathya.mapper.CountryMapper;
@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Country> getAllCountries() {
		List<Country> countriesList=jdbcTemplate.query("select * from country",new CountryMapper());
		return countriesList;

	}

}
