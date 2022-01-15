package com.mike.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mike.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{ //instanciar objeto repository
	
}
 