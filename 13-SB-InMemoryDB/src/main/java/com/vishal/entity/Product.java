package com.vishal.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

@Id
Integer id;	
String productName;
Integer price;
Integer shelfLife;
String color;


@CreationTimestamp // Automatically stores current timestamp when record is INSERTED.
@Column(updatable = false)  // Prevents this column from changing during UPDATE.
LocalDateTime dateCreated;



@UpdateTimestamp //Automatically updates time stamp when record is updated
@Column(insertable = false)  // Prevents from inserting value during INSERT query
LocalDateTime dateUpdated;
	
}
