package com.example.demo;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
  
  TodoRepository repository;
  
  @Autowired
  public DemoApplication(TodoRepository repository) {
    this.repository = repository;
  }
  
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
  
  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("I'm a cool guy"));
    repository.save(new Todo("Life is easy, innit"));
    repository.save(new Todo("Jesus was not real"));
  }
}

