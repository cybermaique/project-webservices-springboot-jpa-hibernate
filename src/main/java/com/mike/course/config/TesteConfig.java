package com.mike.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mike.course.entities.User;
import com.mike.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner { // essa classe é pra fazer o database seeding (popular o db)...
	// pra popular, é necessário antes acessar primeiro acessar o db, q no caso a
	// classe q faz isso é o repository

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception { // tudo dentro desse método vai ser executado quando a aplicação
														// for iniciada
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}
