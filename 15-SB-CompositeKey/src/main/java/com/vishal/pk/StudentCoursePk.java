package com.vishal.pk;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable  // signifies that this class can be embedded in another entity class
public class StudentCoursePk implements Serializable{

Integer studentId;

Integer courseId;




	
	
}
