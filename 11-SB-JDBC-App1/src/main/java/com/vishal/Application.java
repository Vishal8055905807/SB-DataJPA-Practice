package com.vishal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vishal.entity.AnimalInfo;
import com.vishal.service.AnimalService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		AnimalService animalServiceObj= context.getBean(AnimalService.class);
		
		AnimalInfo animal = new AnimalInfo();
		animal.setId(103);
		animal.setName("Rhino");
		animal.setCountryOfOrigin("Africa");
		animal.setNoOfLegs(4);
		animal.setAgeLimit(50);
		
		// animalServiceObj.test();
		
		// animalServiceObj.save(animal);
		
		//animalServiceObj.getAllAnimals();
		
		// animalServiceObj.getAnimalbyId(102);
		
		AnimalInfo animal4 = new AnimalInfo();
		animal4.setId(104);
		animal4.setName("Penguin");
		animal4.setCountryOfOrigin("Antartica");
		animal4.setNoOfLegs(2);
		animal4.setAgeLimit(12);
		
		AnimalInfo animal5 = new AnimalInfo();
		animal5.setId(105);
		animal5.setName("Dinosaur");
		animal5.setCountryOfOrigin("Distinct-now");
		animal5.setNoOfLegs(2);
		animal5.setAgeLimit(60);
		
		AnimalInfo animal6 = new AnimalInfo();
		animal6.setId(106);
		animal6.setName("Human");
		animal6.setCountryOfOrigin("Everywhere");
		animal6.setNoOfLegs(2);
		animal6.setAgeLimit(70);
		
		
		
		List<AnimalInfo> li = new LinkedList<AnimalInfo>();
		li.add(animal4);
		li.add(animal5);
		li.add(animal6);
		
		//animalServiceObj.saveAllData(li);
		
		// animalServiceObj.findAllById(Arrays.asList(102,103,104,333));
		
		
		// animalServiceObj.existsByAnimalId(105);
		// animalServiceObj.existsByAnimalId(333);
		
		// animalServiceObj.countOfAnimals();
		
		// animalServiceObj.deleteAnimalById(102);
		
		// animalServiceObj.deleteAllAnimalsById(Arrays.asList(103,104));
		
		// animalServiceObj.methodCreatedByProperMethodName();
		
		// animalServiceObj.methodCreatedByUsingSQL();
		// animalServiceObj.methodCreatedUsingHQL();
		
		// animalServiceObj.deleteByIdUsingHQL(103);
		
		
		
		
		
		
		
	}

}
