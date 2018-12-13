package com.greenfoxacademy.day4.Exercise1.Exercise4;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
  
  @GetMapping("/gfa")
  public String main() {
    
    return "main";
  }
}
