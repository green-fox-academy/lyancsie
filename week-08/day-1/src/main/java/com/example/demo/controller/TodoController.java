package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {
  
  public TodoRepository getRepository() {
    return repository;
  }
  
  private TodoRepository repository;
  
  @Autowired
  public TodoController(TodoRepository repository) {
    this.repository = repository;
  }
  
  @GetMapping("/list")
  public String list(Model model) {
    model.addAttribute("todos", repository.findAll());
    return "todolist";
  }
  
  @GetMapping("/")
  public String activeList(Model model, @RequestParam(value = "isActive", required = true) String input) {
    if (input.equals("true")) {
      model.addAttribute("todos", repository.findAllByDone(false));
    } else {
      model.addAttribute("todos", repository.findAllByDone(true));
    }
    return "todolist";
  }
  
  @GetMapping("/add")
  public String add() {
    return "add";
  }
  
  @PostMapping("/list")
  public String add(@RequestParam String newTaskName) {
    repository.save(new Todo(newTaskName));
    return ("redirect:/todo/list");
  }
  
  @GetMapping("/delete")
  public String delete(@PathVariable Long id) {
    repository.delete(repository.findById(id).get());
    return ("redirect:/todo/list");
  }
}