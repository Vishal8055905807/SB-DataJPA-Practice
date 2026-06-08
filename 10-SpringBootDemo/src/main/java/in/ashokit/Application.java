package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import in.ashokit.dao.UserDao;

@SpringBootApplication
@ComponentScan(basePackages = {"in.ashokit" , "in.vishalit"})
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		//  UserDao userDaoObj = ctxt.getBean(UserDao.class);
				     
		//ConfigurableApplicationContext is a interface, IOC container is implementation class
		//Implementation class changes based on pom.xml starters 
		//IOC is using which implementation class can be known by:
		// System.out.println("Class Name: " +ctxt.getClass().getName());
		
		
		
		
		
		
	}

}
