package com.example.demo.controller;

import com.example.demo.model.Cat;
import com.example.demo.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CatController {
  
  private CatRepository repository;
  
  @Autowired
  public CatController(CatRepository repository) {
    this.repository = repository;
  }
  
  @GetMapping("/create")
  public String create(@RequestParam(required = false) String name) {
    repository.save(new Cat(name));
    return "index";
  }
  
  @GetMapping("/list")
  @ResponseBody
  public List<Cat> list() {
    return (List<Cat>) repository.findAll(); //it does not work yet!!! we need getters and setters for the Cat
  } //or return an Iterable
  //columndefinition(sql code)
}
