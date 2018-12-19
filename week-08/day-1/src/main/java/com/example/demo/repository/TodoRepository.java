package com.example.demo.repository;

import com.example.demo.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  
  List<Todo> findAllByTitle(String title);
  
  List<Todo> findAllByUrgent(Boolean urgent);
  
  List<Todo> findAllByDone(Boolean done);
  
  List<Todo> findAllByOrderByIdAsc();
  
  List<Todo> findTodoByTitleContainsOrderByIdAsc(String search);
  
  List<Todo> findTodoByDescriptionContainsOrderByIdAsc(String search);
}
