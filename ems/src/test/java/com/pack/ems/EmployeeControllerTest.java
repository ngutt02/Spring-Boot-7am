package com.pack.ems;
//import static org.assertj.core.api.Assertions.assertThat;

//import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

//import org.springframework.util.Assert;
//import org.springframework.util.Assert;
//import static org.junit.Assert;
import com.pack.ems.controller.StudentController;


@SpringBootTest
public class EmployeeControllerTest {
	@Autowired
	private StudentController controller;

	@Test
	public void contextLoads() throws Exception {
		//assertThat(controller.getIndexPage()).isNotNull();
		assertEquals(controller.getIndexPage(),"index");
	}

}
