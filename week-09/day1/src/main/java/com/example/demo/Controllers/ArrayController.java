package com.example.demo.Controllers;

import com.example.demo.Models.CustomArray;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {
  
  @PostMapping("/arrays")
  public Object arrays(@RequestBody CustomArray customArray) {
    customArray.decide();
    return customArray;
  }
}