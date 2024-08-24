package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.*;

import lombok.Data;

@Document(collection = "user")
@Data
public class User {

	@Id
	private String userId;
	private String firstName;
	private String lastName;
	private String address;
	private long phoneNo;

}
