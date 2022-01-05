package com.mike.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mike.course.entities.User;
import com.mike.course.services.UserService;

//controlador rest

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	@GetMapping // responds to get request
	public ResponseEntity<List<User>> findAll() {

		List<User> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){ //pathvariable é pro spring aceitar o id q for digitado na url
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
