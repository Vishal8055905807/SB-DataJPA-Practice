package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.ashokit.security.AppSecurity;

@Configuration
@ComponentScan(basePackages = "in.ashokit")
public class AppConfig {
	
public AppConfig() {
	System.out.println("AppConfig constructor");
}

//@Bean annotation is used when we want to create our own customized object and give that object to IoC for managing.
//Usually IoC itself creates object and manages it on its own.

@Bean
public AppSecurity createInstance() {
	//security logic
	return new AppSecurity();
}

}


