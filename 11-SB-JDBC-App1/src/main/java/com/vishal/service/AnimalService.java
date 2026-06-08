package com.vishal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vishal.entity.AnimalInfo;
import com.vishal.repo.AnimalInfoRepo;

@Service
public class AnimalService {

@Autowired
AnimalInfoRepo animalInfoRepo;

public void test() {
	String implClassName = animalInfoRepo.getClass().getName();
	System.out.println(implClassName);
	
}


// PRE-DEFINED METHODS

//save()
//This is an UPSERT method i.e. it will either Insert data or Update data based on primary key
//It is a example of Runtime-Polymorphism (method will change behavior on runtime based on primary key)

public void save(AnimalInfo a) {   	
	animalInfoRepo.save(a);
	System.out.println("One animal info inserted/updated");
}


public void getAllAnimals() {
	Iterable<AnimalInfo> allAnimals = animalInfoRepo.findAll();
	allAnimals.forEach(System.out::println);
}


public void getAnimalbyId(Integer id) {
	Optional<AnimalInfo> animal = animalInfoRepo.findById(id);
	if(animal.isPresent()) {
		System.out.println(animal.get());
	}
}


public void saveAllData(List<AnimalInfo> animalsList) {
	animalInfoRepo.saveAll(animalsList);
	
}

public void findAllById(List<Integer> li) {
	Iterable<AnimalInfo> allById = animalInfoRepo.findAllById(li);
	allById.forEach(System.out::println);
}

public void existsByAnimalId(Integer id) {
	boolean existsById = animalInfoRepo.existsById(id);
	System.out.println(existsById);
}

public void countOfAnimals() {
	long count = animalInfoRepo.count();
	System.out.println(count);
	
}

public void deleteAnimalById(Integer id) {
	animalInfoRepo.deleteById(id);
}

public void deleteAllAnimalsById(List<Integer> idList) {
	animalInfoRepo.deleteAllById(idList);
}

// Query Methods : Allows you to define queries just by method names 


public void methodCreatedByProperMethodName() {
	
//List<AnimalInfo> byNoOfLegsGreaterThanEqual = animalInfoRepo.findByNoOfLegsGreaterThanEqual(4);	
//byNoOfLegsGreaterThanEqual.forEach(System.out::println);
	
// List<AnimalInfo> byCountryOfOrigin = animalInfoRepo.findByCountryOfOrigin("Africa");
// byCountryOfOrigin.forEach(System.out::println);

// List<AnimalInfo> byCountryOfOriginIgnoreCase = animalInfoRepo.findByCountryOfOriginIgnoreCase("INDIA");
// byCountryOfOriginIgnoreCase.forEach(System.out::println);

List<AnimalInfo> byAgeLimitGreaterThanAndName = animalInfoRepo.findByAgeLimitGreaterThanAndName(20, "Rhino");
byAgeLimitGreaterThanAndName.forEach(System.out::println);

}


public void methodCreatedByUsingSQL() {
	
	List<AnimalInfo> allAnimalsList = animalInfoRepo.fetchAllAnimals();
	allAnimalsList.forEach(System.out::println);
}

public void methodCreatedUsingHQL() {
	List<AnimalInfo> allAnimalsList = animalInfoRepo.fetchAllAnimals2();
	allAnimalsList.forEach(System.out::println);
}



public void deleteByIdUsingHQL(Integer id) {
	int rowsDeleted = animalInfoRepo.deleteByIdHQLUsed(id);
	System.out.println(rowsDeleted);
}

	
}
