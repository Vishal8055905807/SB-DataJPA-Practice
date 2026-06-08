package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("bean.xml");
		UserService userServiceObject = ctxt.getBean(UserService.class);
		userServiceObject.register("Vishal", "vishal@gmail.com", 7774483l);
		
		
		
		
		System.out.println("Application working");
	}

}
