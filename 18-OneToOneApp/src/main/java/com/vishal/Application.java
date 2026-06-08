package com.vishal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vishal.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		PersonService serviceObj = ctxt.getBean(PersonService.class);
		
		
//		serviceObj.savePersonWithPAN();  // parent + child
//		serviceObj.savePanWithPerson();  // child + parent
		
//		serviceObj.deleteAPersonById(5);    // parent + child  
//		serviceObj.deleteAPan(3);			//child + parent
		
//		serviceObj.getPersonWithPan(3);   // parent + child 
//		serviceObj.getPan(3);  // child + parent 
		

		
		
		
		
	}

}
