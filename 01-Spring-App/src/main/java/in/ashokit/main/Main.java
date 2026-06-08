package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Car;
import in.ashokit.beans.Engine;

public class Main {

	public static void main(String[] args) {
		
		// Start IOC Container
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring-beam.xml");
		
//		//Get bean object from IOC
//     	Engine engObject = ctxt.getBean(Engine.class);
//	
//		//Calling bean method
//	    engObject.start();
		
		Car carObject = ctxt.getBean(Car.class);
		carObject.drive();
		
// Now we perform dependency injection
		//1] Constructor Injection
		//2] Setter Injection
		
		
	    
	    
	    
	    
	    
	    
	
	}

}
