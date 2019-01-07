package com.example.demo.Controllers;

import com.example.demo.Models.Error;
import com.example.demo.Models.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
  
  @GetMapping("/greeter")
  public Object greet(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    if (name != null && title != null) {
      return new Greeter(name, title);
    }
    return new Error("Provide all the details!");
  }
}