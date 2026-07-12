package com.vishal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.dto.UserDTO;
import com.vishal.entity.User;
import com.vishal.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public UserDTO getUserById(Integer id) {
			User user = userRepo.findById(id)
					.orElseThrow(() -> new RuntimeException("User not found"));
		
			UserDTO dto = new UserDTO();
		    dto.setId(user.getId());
		    dto.setName(user.getName());
		    dto.setEmail(user.getEmail());
		    
		    return dto;

	
	}

}

