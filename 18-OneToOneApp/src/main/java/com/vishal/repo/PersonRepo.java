package com.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
