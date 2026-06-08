package in.ashokit;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("bean2.xml");
		ShoppingCart shoppingCartObj = ctxt.getBean(ShoppingCart.class);
		shoppingCartObj.placeOrder();
		
		
		
		System.out.println("Application working...");
	}

}
