package com.mike.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mike.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping //responds to get request
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maique", "maiqued.18@gmail.com", "99999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
