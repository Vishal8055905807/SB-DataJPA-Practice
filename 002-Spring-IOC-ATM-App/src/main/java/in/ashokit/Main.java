package in.ashokit;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		Atm atmObj = ctxt.getBean(Atm.class);
		atmObj.withdraw();	
	}

}

