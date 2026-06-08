package in.ashokit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.shopping.ShoppingCart;

public class Main {
public static void main(String[] args) {
	
AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
ShoppingCart shoppingCartObj = ctxt.getBean(ShoppingCart.class);
shoppingCartObj.placeOrder();
	
}
}
