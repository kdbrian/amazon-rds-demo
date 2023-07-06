package com.junrdev.rds;

import com.junrdev.rds.model.Todo;
import com.junrdev.rds.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RdsApplication implements CommandLineRunner {

	@Autowired
	private TodoRepository repository;


	public static void main(String[] args) {
		SpringApplication.run(RdsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Todo("todo1", "demo todo 1"));
		repository.save(new Todo("todo2", "demo todo 2"));
		repository.save(new Todo("todo3", "demo todo 3"));
		repository.save(new Todo("todo4", "demo todo 4"));
	}
}
