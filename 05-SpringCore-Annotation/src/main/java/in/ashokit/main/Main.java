package in.ashokit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.service.UserService;

public class Main {
public static void main(String[] args) {
	
	//Starting IOC container
	ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
	UserService userServiceObject = ctxt.getBean(UserService.class);
	userServiceObject.printName();
	
	
}
}
