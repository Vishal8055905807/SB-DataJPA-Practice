package com.vishal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AnimalInfo {

@Id
private Integer id;	
private String name;
private int noOfLegs;
private String countryOfOrigin;
private int ageLimit;

}
	
