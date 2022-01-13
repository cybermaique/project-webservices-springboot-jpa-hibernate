package com.mike.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mike.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{ //instanciar objeto repository
	
}
 