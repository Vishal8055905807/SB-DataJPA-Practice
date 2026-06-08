package com.vishal.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = "person1")
public class PanCard {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer panId;
Integer panNo;
LocalDate issueDate;

@OneToOne (cascade = CascadeType.ALL)                                 // states One to One relationship in entities
@JoinColumn(name = "person_id_fk")         // creates a column with given name as foreign key
private Person person1; 


//Whenever there is JoinColumn annotation Hibernate creates Foreign Key column.
//So in PanCard table there will be a column named person_id_fk





}
