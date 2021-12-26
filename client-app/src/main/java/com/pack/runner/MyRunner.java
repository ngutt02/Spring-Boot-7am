package com.pack.runner;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.pack.dto.BookDTO;
@Component
public class MyRunner implements CommandLineRunner {

	private static String GET_URL_1="http://localhost:4343/Bookapi/books/all";
	private static String GET_URL_2="http://localhost:4343/Bookapi/book/{bookId}";
	private static String POST_URL="http://localhost:4343/Bookapi/book/create";
	private static String PUT_URL="http://localhost:4343/Bookapi/book/update";
	private static String DELETE_URL="http://localhost:4343/Bookapi/book/delete?bookId=1178";

	
	public void run(String... args) throws Exception {
		RestTemplate restTemplate=new RestTemplate();
		/*ParameterizedTypeReference<BookDTO> typeref=new ParameterizedTypeReference<BookDTO>(){};*/
		/*ResponseEntity<List<BookDTO>> resp= restTemplate.exchange(GET_URL_1,HttpMethod.GET, null,typeref);
		List<BookDTO> list=resp.getBody();
		for(BookDTO dto:list)
		{
			System.out.println(dto);

		}*/
		 

          Object obj=restTemplate.getForObject(GET_URL_2,List.class,1178);
		
          System.out.println(obj);
		
		/*ResponseEntity<BookDTO> resp=restTemplate.exchange(GET_URL_2,HttpMethod.GET,null,typeref);
		BookDTO list=resp.getBody();
		System.out.println(list);*/



		/*BookDTO dto=new BookDTO();
		dto.setBookId(1010);
		dto.setName("Black Hole");
		dto.setPrice(900.0);

		HttpEntity http=new HttpEntity(dto);

		ResponseEntity<String> resp=restTemplate.exchange(POST_URL,HttpMethod.POST,http,typeref);
		String str=resp.getBody();
		System.out.println(str);
		 

		ResponseEntity<String> resp=restTemplate.exchange(PUT_URL,HttpMethod.PUT,http,typeref);
		String str=resp.getBody();
		System.out.println(str);
		
*/		
		
		 
		
		 	
		 
		
		
		
		/*ResponseEntity<String> resp=restTemplate.exchange(DELETE_URL,HttpMethod.DELETE,null,String.class);
		
		
		String str=resp.getBody();
		System.out.println(str);*/
		

	}
	

}


