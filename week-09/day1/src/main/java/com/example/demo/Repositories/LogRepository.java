package com.example.demo.Repositories;

import com.example.demo.Models.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Long, Log> {
  
}
