package com.example.demo.Controllers;

import com.example.demo.Models.DoubledValue;
import com.example.demo.Models.Error;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DoubleController {
  
  @GetMapping("/doubling")
  public Object doubling(@RequestParam(required = false) Integer input) {
    if (input != null) {
      return new DoubledValue(input);
    }
    return new Error("Please provide an input");
  }
}
