package com.mike.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mike.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{ //instanciar objeto repository
	
}
 