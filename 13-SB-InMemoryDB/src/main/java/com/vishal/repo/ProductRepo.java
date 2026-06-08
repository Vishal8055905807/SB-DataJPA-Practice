package com.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
