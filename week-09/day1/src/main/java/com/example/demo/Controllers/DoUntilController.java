package com.example.demo.Controllers;

import com.example.demo.Models.DoUntil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilController {
  
  @PostMapping("/dountil/{action}")
  public Object dountil(@PathVariable(required = false) String action, @RequestParam(required = false) Integer number) {
    if (action != null) {
      return new DoUntil(number, action);
    }
    return new Error("Please provide an input!");
  }//not working yet
}
