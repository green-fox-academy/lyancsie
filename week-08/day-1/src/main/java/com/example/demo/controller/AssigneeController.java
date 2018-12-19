package com.example.demo.controller;

import com.example.demo.model.Assignee;
import com.example.demo.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/assignees")
public class AssigneeController {
  
  private AssigneeRepository assigneeRepository;
  
  public AssigneeRepository getAssigneeRepository() {
    return assigneeRepository;
  }
  
  @Autowired
  public AssigneeController(AssigneeRepository repository) {
    this.assigneeRepository = repository;
  }
  
  @GetMapping({"/", ""})
  public String assignee(Model model) {
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "assignees";
  }
  
  @PostMapping({"/", ""})
  public String assigneePost(@RequestParam String newAssigneeName, @RequestParam String newAssigneeMail) {
    assigneeRepository.save(new Assignee(newAssigneeName, newAssigneeMail));
    return ("redirect:/assignees");
  }
  
  @GetMapping("/add")
  public String addAssignee() {
    return "addassignee";
  }
}
