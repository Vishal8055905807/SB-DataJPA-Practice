package com.vishal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.dto.UserDTO;
import com.vishal.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/user/{id}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable Integer id) {
		UserDTO userById = userService.getUserById(id);
		
		return new ResponseEntity<UserDTO>(userById, HttpStatus.OK);
	}

	
}
