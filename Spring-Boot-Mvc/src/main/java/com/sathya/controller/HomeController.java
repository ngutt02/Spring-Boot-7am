package com.sathya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.sathya.bean.HomeBean;

@Controller
public class HomeController {
	/*@GetMapping("/home")
	public ModelAndView getHomePage()
	{
		return new ModelAndView("home","model","Nicholas Tesla");
	}
	 */

	/*@GetMapping("/home")
	public String getHomePage(Model model)
	{
		HomeBean homeBean=new HomeBean();
		homeBean.setName("Boot");
		String name=homeBean.getName();
		model.addAttribute("model",name);
		return "home";
	}*/

	/*@GetMapping("/home")
	public String getHomePage(Map map)
	{
		HomeBean homeBean=new HomeBean();
		homeBean.setName("James Clerk Maxwell");
		String name=homeBean.getName();
		map.put("model",name);
		return "home";
	}*/
	@GetMapping("/home")
	public String getHomePage(ModelMap modelMap)
	{
		HomeBean homeBean=new HomeBean();
		homeBean.setName("Kalam Ji");
		//homeBean.name="Abdul";
		String name=homeBean.getName();
		modelMap.addAttribute("model",name);

		return "home";
	}
}
