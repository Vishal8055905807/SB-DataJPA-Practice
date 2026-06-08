package com.vishal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vishal.service.VehicleService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		VehicleService serviceObj = ctxt.getBean(VehicleService.class);
		serviceObj.saveVehicleAndOwner();
		
	}

}
