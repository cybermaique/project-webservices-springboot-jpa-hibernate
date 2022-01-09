package com.mike.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mike.course.entities.Order;
import com.mike.course.services.OrderService;

//controlador rest

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService service;

	@GetMapping // responds to get request
	public ResponseEntity<List<Order>> findAll() {

		List<Order> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){ //pathvariable é pro spring aceitar o id q for digitado na url
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
