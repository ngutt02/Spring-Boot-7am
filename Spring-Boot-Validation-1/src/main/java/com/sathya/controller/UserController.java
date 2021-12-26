package com.sathya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.sathya.bean.Country;
import com.sathya.bean.RegisterBean;
import com.sathya.dao.IUserDao;

@Controller
public class UserController {

	@Autowired
	private IUserDao dao;


	@GetMapping("register")
	public String getRegistrationPage(ModelMap map)
	{
		List<Country> countriesList=dao.getAllCountries();
		RegisterBean bean=new RegisterBean();
		bean.setCountriesList(countriesList);
		map.addAttribute("bean",bean);
		return "registration";
	}






}
