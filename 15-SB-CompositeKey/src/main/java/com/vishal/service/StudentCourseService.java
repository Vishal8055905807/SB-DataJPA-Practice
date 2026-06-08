package com.vishal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.entity.StudentCourse;
import com.vishal.pk.StudentCoursePk;
import com.vishal.repo.StudentRepo;

@Service
public class StudentCourseService {

@Autowired
StudentRepo studentRepo;	

public void save() {
	
StudentCoursePk scpk = new StudentCoursePk(101, 1);	

StudentCourse sc = new StudentCourse(scpk,"Vishal", "Spring");
	
studentRepo.save(sc);	
	
System.out.println("Student data added succesfully");
}
	
}
