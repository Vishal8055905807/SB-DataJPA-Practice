package com.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}

