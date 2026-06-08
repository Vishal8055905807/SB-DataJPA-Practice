package com.vishal.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.entity.UserInfo;

public interface UserRepo extends JpaRepository<UserInfo, Integer> {

	
	
}

