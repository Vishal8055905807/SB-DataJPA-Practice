package com.vishal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class VehicleOwner {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer ownerId;
String ownerName;

	
	
}
