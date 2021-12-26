package com.pack.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.pack.dto.BookDTO;

@Controller
public class ClientController {
	RestTemplate restTemplate=new RestTemplate();
	ParameterizedTypeReference<List<BookDTO>> typeRef=new ParameterizedTypeReference<List<BookDTO>>(){};
	private static String GET_URL_1="http://localhost:4343/Bookapi/books/all";
	private static String GET_URL_2="http://localhost:4343/Bookapi/book/{bookId}";
	private static String POST_URL="http://localhost:4343/Bookapi/book/create";
	private static String PUT_URL="http://localhost:4343/Bookapi/book/update";
	private static String DELETE_URL="http://localhost:4343/Bookapi/book/delete?bookId=1178";



	@GetMapping("/index")
	public String getIndexPage()
	{

		return "index";
	}

	@GetMapping("/bookAll")
	public String getAllBooks(Model model)
	{
		HttpHeaders headers=new HttpHeaders();
		headers.setBasicAuth("scott", "1");
		HttpEntity entity=new  HttpEntity(headers);
		ResponseEntity<List<BookDTO>> resp=restTemplate.exchange(GET_URL_1,HttpMethod.GET,entity,typeRef);
		List<BookDTO> list=resp.getBody();
		model.addAttribute("list",list);
		return "booksList";


	}








}
