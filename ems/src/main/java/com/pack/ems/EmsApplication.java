package com.pack.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*import com.pack.ems.controller.IEmployeeService;*/

@SpringBootApplication
public class EmsApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(EmsApplication.class);
	}
	
	/*@Autowired
	public IEmployeeService service;
	*/

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EmsApplication.class, args);
		
		
		
		
	
		
		

		/*	ArrayList<Employee> al=new ArrayList<>();
			
		Employee e=new Employee();
		e.setEmpNo(101);
		e.setDeptNo(1);
		e.setEname("scott");
		e.setSalary(5000.00);

		Employee e1=new Employee();
		e1.setEmpNo(101);
		e1.setDeptNo(1);
		e1.setEname("scott");
		e1.setSalary(5000.00);




		al.add(e);
		al.add(e1);
		System.out.println("size of the list:"+al.size());
		
		
		Integer i=new Integer(1);
		Integer i1=new Integer(1);
		
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(i);
		al2.add(i1);
		System.out.println("size of the list:"+al2.size());
				
				
	

*/		
		
	/*	
		
				HashMap<Employee,String> hm=new HashMap<>();
		
		Employee e=new Employee();
		e.setEmpNo(101);
		e.setDeptNo(1);
		e.setEname("scott");
		e.setSalary(5000.00);

		Employee e1=new Employee();
		e1.setEmpNo(101);
		e1.setDeptNo(1);
		e1.setEname("scott");
		e1.setSalary(5000.00);

		
		
		
		hm.put(e,"infosys");
		hm.put(e1,"TCS");
		System.out.println("size of the map:"+hm.size());
		System.out.println("map content:"+hm);		
		*/
		
		
		
	/*	HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"A");
		hm.put(1, "B");
		System.out.println("output of map:"+hm);
		
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/*@Override
	public void run(String... args) throws Exception {
		service.doSomething();
		
	}*/
	/*@PostConstruct
	public void ready()
	{
		service.doSomething();
		
		
		
		
	}
*/
}
