package com.pluralsight.conference.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.conference.model.User;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public User getUser(@RequestParam(value = "firstname", defaultValue = "Ryspek") String firstname,
			@RequestParam(value = "lastname", defaultValue = "Baibosunov") String lastname,
			@RequestParam(value = "age", defaultValue = "26") int age) {
		
		User user = new User();
		
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setAge(age);
		
		return user;
	}

}
