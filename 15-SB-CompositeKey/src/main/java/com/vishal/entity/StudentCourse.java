package com.vishal.entity;

import com.vishal.pk.StudentCoursePk;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students_course")
public class StudentCourse {
	
@EmbeddedId
StudentCoursePk id;

String studentName;

String courseName;
	

}
