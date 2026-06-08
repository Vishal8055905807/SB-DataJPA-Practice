package com.vishal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.h2.entity.Employee;
import com.vishal.h2.repo.EmployeeRepo;
import com.vishal.mysql.entity.Product;
import com.vishal.mysql.repo.ProductRepo;

@Service
public class ProductAndEmployeeService {

@Autowired	
ProductRepo productRepo;	

@Autowired
EmployeeRepo empRepo;

public void saveData() {
	
Product p = new Product(101 , "Cricket-Bat")	;

Employee e = new Employee(11,"Vartik");

productRepo.save(p);

empRepo.save(e);

System.out.println("Product and employee data saved");
	
}


	
}
