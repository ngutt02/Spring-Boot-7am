package com.pack.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pack.dto.ProductDTO;
import com.pack.entity.Product;
import com.pack.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	ProductRepository repository;

	@GetMapping("/index")
	public String getIndexPage()
	{
		System.out.println("hiii");
		return "index";
	}
	@GetMapping("/addProduct")
	public String getAddProductPage(Model model)
	{
		ProductDTO dto=new ProductDTO();
		model.addAttribute("product",dto);

		return "product";
	}

	@PostMapping("/save")
	public String saveProductOnDataBase(@Valid@ModelAttribute("product")ProductDTO dto,Model model)
	{
		Product product=new Product();
		BeanUtils.copyProperties(dto,product);
		repository.save(product);
		model.addAttribute("msg","Product Added to database successfully");
		return "success";
	}















}
