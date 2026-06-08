package com.vishal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {

@Id	
//@GeneratedValue(strategy = GenerationType.AUTO)   //  Hibernate decides best strategy automatically based on database.
@GeneratedValue(strategy = GenerationType.IDENTITY)  // Uses database auto-increment feature. Mosy use now-a-days.
Integer id;
String name;
Integer price;
String color;
	
}
