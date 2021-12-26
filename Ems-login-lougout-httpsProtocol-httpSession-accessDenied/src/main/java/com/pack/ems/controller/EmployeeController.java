package com.pack.ems.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.ems.model.Employee;
import com.pack.ems.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository repository;


	@GetMapping("/index")
	public String getIndexPage()
	{


		return "index";



	}
	@GetMapping("/addEmployee")
	public String getAddEmployeePage(Model model)
	{
		Employee employee=new Employee();
		model.addAttribute(employee);
		return "addEmployee";

	}
	@PostMapping("/save")
	public String saveEmployee(@Valid@ModelAttribute("employee")Employee employee,BindingResult result,Model model)
	{

		if(result.hasErrors())
		{
			model.addAttribute("employee",employee);
			return "addEmployee";
		}


		else {


			com.pack.ems.entity.Employee emp=new com.pack.ems.entity.Employee();
			BeanUtils.copyProperties(employee,emp);
			boolean flag=repository.existsById(emp.getEmpNo());
			if(flag)
			{
				model.addAttribute("message","Sorry!! Employee Already Exist!!");
			}
			else
			{
				repository.save(emp);
				System.out.println("hii");
				model.addAttribute("message","Employee added To dataBase");
			}
			return "index";
		}
	}

	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/listEmployees")
	public String getAllEmployee(Model model)
	{
		List<com.pack.ems.entity.Employee> list=repository.findAll();
		List<com.pack.ems.model.Employee> emplist2=new ArrayList<>();
		BeanUtils.copyProperties(list,emplist2);
		System.out.println("hiii from list ");
		model.addAttribute("list",list);
		return "employeesList";
	}


	@GetMapping("/editEmployee")
	public String editEmployeePage(@RequestParam("empno")Integer empNo,Model model)
	{
		Optional<com.pack.ems.entity.Employee> opt=repository.findById(empNo);
		com.pack.ems.entity.Employee entityEmployee=opt.get();
		Employee employee=new Employee();
		BeanUtils.copyProperties(entityEmployee,employee);
		model.addAttribute("employee",employee);

		return "editEmployee";
	}

	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute("employee")Employee emp,Model model)
	{
		com.pack.ems.entity.Employee entityEmployee=new com.pack.ems.entity.Employee();
		BeanUtils.copyProperties(emp, entityEmployee);
		repository.saveAndFlush(entityEmployee);
		System.out.println("hiii from update");
		/*List<com.pack.ems.entity.Employee> employeesList=repository.findAll();
		List<Employee> empList2=new ArrayList<>();
		Collections.copy(empList2,employeesList);*/

		return "redirect:listEmployees";

	}
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam("empno")Integer empNo)
	{
		System.out.println("hiiii-before");
		repository.deleteById(empNo);
		System.out.println("hiiii-after");
		return "redirect:listEmployees";
	}
	@GetMapping("/search")
	public String searchEmployee(@RequestParam("deptNo")Integer deptNo,Model model)
	{

		List<com.pack.ems.entity.Employee> empList=	repository.findByDeptNo(deptNo);
		for(com.pack.ems.entity.Employee emp:empList)
		{
			Integer	dept1=emp.getDeptNo();
			if(deptNo==dept1)
			{
				model.addAttribute("list",empList);
				model.addAttribute("message", null);

			}

			else {
				model.addAttribute("message","Invalid Department Number");
			}

		}
		return "employeesList";

	}
	@GetMapping("/login")
	public String getLoginPage(@RequestParam(value="msg",required=false)String message,Model model)
	{
		if(message!=null)
		{
			model.addAttribute("message",message);
		}
		return "myLogin";
	}

	@GetMapping("/accessDenied")
	public String getAccessDeniedPage()
	{
		return "accessDeniedPage";
	}

	@GetMapping("/loggedout")
	public String getLoginPage()
	{
		return "logoutPage";

	}

}
