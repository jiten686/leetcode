package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<?> getUserDetails(@PathVariable String userId ) {
		try {
			User user = userService.getUserDetails(userId);
			return new ResponseEntity<>(user,HttpStatus.OK);
		} catch (RuntimeException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	
	}
	
	@PostMapping("/user")
	public ResponseEntity<?> addUser(@RequestBody User user){
		return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
	}
	
	@PutMapping("/user/{userId}")
	public ResponseEntity<?> updateUser(@PathVariable String userId  ,@RequestBody User user){
		try {
			User updatedUser = userService.updateUser(userId,user);
			return new ResponseEntity<>(updatedUser,HttpStatus.OK);
		} catch (RuntimeException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable String userId){
		try {
			userService.deleteUser(userId);
			return new ResponseEntity<>("user gets deleted",HttpStatus.OK);
		} catch (RuntimeException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	

}
