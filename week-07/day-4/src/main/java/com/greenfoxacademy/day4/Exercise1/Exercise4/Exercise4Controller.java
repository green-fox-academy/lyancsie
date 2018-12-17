package com.greenfoxacademy.day4.Exercise1.Exercise4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Exercise4Controller {
  
  @GetMapping("/gfa")
  public String main(@RequestParam String x) {
    
    return "main";
  }
  
  @PostMapping("/gfa")
  public String myShit() {
    
    return "main";
  }
}
