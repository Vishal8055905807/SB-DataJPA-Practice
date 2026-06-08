package com.vishal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer id;
String area;
String state;
String type;
 
@ManyToOne
@JoinColumn(name = "worker_id_fk")
private Worker work1;
	
}
