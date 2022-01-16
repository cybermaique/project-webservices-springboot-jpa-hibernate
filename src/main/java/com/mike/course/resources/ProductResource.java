package com.mike.course.resources;

//No Banco de Dados relacional, para associar os produtos com as categorias, usamos a tabela de associação. Aprendemos isso no banco de dados quando vamos transformar um modelo de análise para uma modelo relacional.
//Dessa forma, temos que mapear as nossas classes Produto e Categoria, para que a tabela de associação apareça no Banco de Dados relacional.

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mike.course.entities.Product;
import com.mike.course.services.ProductService;

//controlador rest

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService service;

	@GetMapping // responds to get request
	public ResponseEntity<List<Product>> findAll() {

		List<Product> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){ //pathvariable é pro spring aceitar o id q for digitado na url
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
