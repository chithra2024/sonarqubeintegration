package com.stackroute.sonarqube;

import com.stackroute.sonarqube.controller.HomeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarqubeApplicationTests {

	@Autowired
	private HomeController controller;


	@Test
	void testGetMessage(){
		String message = controller.getMessage();
		Assertions.assertNotNull(message);
	}






	//
//	@Test
//	void contextLoads() {
//	}

}
