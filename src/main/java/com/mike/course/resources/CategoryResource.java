package com.mike.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mike.course.entities.Category;
import com.mike.course.services.CategoryService;

//controlador rest

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;

	@GetMapping // responds to get request
	public ResponseEntity<List<Category>> findAll() {

		List<Category> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){ //pathvariable é pro spring aceitar o id q for digitado na url
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
