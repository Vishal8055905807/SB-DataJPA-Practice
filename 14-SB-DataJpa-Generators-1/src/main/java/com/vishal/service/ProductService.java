package com.vishal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.entity.Product;
import com.vishal.repo.ProductRepo;

@Service
public class ProductService {

@Autowired
ProductRepo productRepo;	
	
public void saveProduct() {	

Product product = new Product();	

product.setName("Mouse");
product.setPrice(1000);
product.setColor("Black");
	
productRepo.save(product);	
	
}
	
}
