package com.sathya.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sathya.bean.RegistrationBean;

@Controller
public class ResgitrationController {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	@GetMapping("/regsiytrationPage")
	public ModelAndView getRegistrationPage(ModelMap model)
	{
		RegistrationBean registrationBean=new RegistrationBean();
		model.addAttribute("regitrationBean",registrationBean);
		return new ModelAndView("register");
	}


	@PostMapping("/registerUser")
	public ModelAndView registerUser(@ModelAttribute @Valid RegistrationBean registrationBean,BindingResult result)
	{


		if(result.hasErrors())
		{
			return new ModelAndView("register");
		}
		else {
			jdbcTemplate.update("update registerTab set username=?,password=?,email=?,address=?,gender=?,country=?",registrationBean.getUsername(),
					registrationBean.getPassword(),
					registrationBean.getGender(),
					registrationBean.getEmail(),
					registrationBean.getAddress(),
					registrationBean.getCountry());
			return new ModelAndView("Form Submitted Successfully");
		}
	}


}
