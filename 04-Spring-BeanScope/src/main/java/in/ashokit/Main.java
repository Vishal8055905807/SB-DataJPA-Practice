package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("bean3.xml");
		
		
		Bike bikeObj1 = ctxt.getBean(Bike.class);
		System.out.println(bikeObj1.hashCode());
		
		Bike bikeObj2 = ctxt.getBean(Bike.class);
		System.out.println(bikeObj2.hashCode());
		
		Bike bikeObj3 = ctxt.getBean(Bike.class);
		System.out.println(bikeObj3.hashCode());
		
		
		
		bikeObj1.run();

	}

}
