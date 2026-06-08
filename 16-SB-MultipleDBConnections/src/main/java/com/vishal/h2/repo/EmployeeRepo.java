package com.vishal.h2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.h2.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
