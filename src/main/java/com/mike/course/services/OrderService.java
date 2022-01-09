package com.mike.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mike.course.entities.Order;
import com.mike.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() { //criando find ALL
		return repository.findAll();
	}
	
	public Order findById(Long id) { //criando find por ID
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
