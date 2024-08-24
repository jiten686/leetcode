package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;

	public User getUserDetails(String userId) {
		
		return userRepo.findById(userId).orElseThrow(() -> new RuntimeException("Invalid user id"));
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	public User updateUser(String userId, User user) {
		userRepo.findById(userId).orElseThrow(() -> new RuntimeException("Invalid user id"));
		return userRepo.save(user);
	}

	public void deleteUser(String userId) {
		User user = userRepo.findById(userId).orElseThrow(() -> new RuntimeException("Invalid user id"));
		userRepo.delete(user);
	}
	
	
	

}
