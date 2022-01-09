package com.mike.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mike.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{ //instanciar objeto repository
	
}
 