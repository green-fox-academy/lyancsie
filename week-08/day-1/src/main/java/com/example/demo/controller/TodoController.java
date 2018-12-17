package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {
  
  private TodoRepository repository;
  
  @Autowired
  public TodoController(TodoRepository repository) {
    this.repository = repository;
  }
  
  @GetMapping({"/", "/list"})
  @ResponseBody
  public List<Todo> list(Model model) {
    model.addAttribute("todos", repository.findAll());
    return (List<Todo>) repository.findAll();
  }
}
