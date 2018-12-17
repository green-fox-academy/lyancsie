package com.example.demo.repository;

import com.example.demo.model.Cat;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//<Table type, ID type>
public interface CatRepository extends CrudRepository<Cat, Long> {
  
  List<Cat> findAllByName(String name);
  //select * from Cat where name=name;
  //FindAllByNameAndType(String name, String type)
}
