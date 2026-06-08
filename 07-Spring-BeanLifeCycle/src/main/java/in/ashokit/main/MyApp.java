package in.ashokit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.config.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ConfigurableApplicationContext cnfgctxt = (ConfigurableApplicationContext) ctxt;
		
		cnfgctxt.close();
		
		
	}

}
