package com.example.demo.repository;

import com.example.demo.model.Assignee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
  
  List<Assignee> findAllByOrderByIdAsc();
}
