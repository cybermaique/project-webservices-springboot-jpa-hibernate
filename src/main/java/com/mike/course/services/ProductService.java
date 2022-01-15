package com.mike.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mike.course.entities.Product;
import com.mike.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() { //criando find ALL
		return repository.findAll();
	}
	
	public Product findById(Long id) { //criando find por ID
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
