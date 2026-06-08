package com.vishal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

@Id
Integer id;
String name;
String gender;
String country;
Integer age;


	
	
	
}
