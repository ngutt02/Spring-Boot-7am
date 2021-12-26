package com.sathya.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sathya.bean.Country;
import com.sathya.bean.RegisterBean;
import com.sathya.dao.IUserDao;
import com.sathya.service.EmailService;

@Controller
public class UserController {
  
	@Autowired
	private IUserDao dao;
	@Autowired
	private EmailService service;
	@InitBinder
	public  void  initBinder(WebDataBinder  webDataBinder)
	{
		SimpleDateFormat  sdf=new SimpleDateFormat("dd/MM/yyyy");
		CustomDateEditor editor=new CustomDateEditor(sdf, true);
		webDataBinder.registerCustomEditor(Date.class, editor);
	}
	@GetMapping("/register")
	public String getRegistrationPage(Model map)
	{
		List<Country> countriesList=dao.getAllCountries();
		RegisterBean bean=new RegisterBean();
		bean.setCountriesList(countriesList);
        map.addAttribute("bean",bean);
		return "registration";
	}
	
	
	
	
	
	@PostMapping("/process")
	public String processRequest(@Valid@ModelAttribute("bean")RegisterBean bean,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			List<Country>  countriesList=dao.getAllCountries();
			bean.setCountriesList(countriesList);
			model.addAttribute("bean",bean);
			return "registration";

		}
		else
		{

			boolean flag=dao.saveUsers(bean);

			System.out.println("form else:"+bean);
			model.addAttribute("bean",bean);
			
			if(flag)
			{
				service.sendEmail(bean.getEmail(),bean.getUsername());
				return "success";
			}
			else {
				System.out.println("flag:"+flag);
				return "failure";
			}
		}

	}
}