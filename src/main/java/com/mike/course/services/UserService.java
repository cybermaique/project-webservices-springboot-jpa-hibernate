package com.mike.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mike.course.entities.User;
import com.mike.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() { //criando find ALL
		return repository.findAll();
	}
	
	public User findById(Long id) { //criando find por ID
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
