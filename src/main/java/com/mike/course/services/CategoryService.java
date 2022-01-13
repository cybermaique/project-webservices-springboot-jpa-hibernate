package com.mike.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mike.course.entities.Category;
import com.mike.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() { //criando find ALL
		return repository.findAll();
	}
	
	public Category findById(Long id) { //criando find por ID
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
