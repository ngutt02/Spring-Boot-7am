package com.sathya.dao;

import java.util.List;

import javax.validation.Valid;

import com.sathya.bean.Country;
import com.sathya.bean.RegisterBean;

public interface IUserDao {

	public List<Country> getAllCountries();

	public boolean saveUsers(RegisterBean bean);

}
