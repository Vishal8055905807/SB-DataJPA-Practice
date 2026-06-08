package com.vishal.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.mysql.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
