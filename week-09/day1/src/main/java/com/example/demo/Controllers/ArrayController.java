package com.example.demo.Controllers;

import com.example.demo.Models.CustomArray;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {
  
  @PostMapping("/arrays")
  public Object arrays(@RequestBody(required = false) CustomArray customArray) {
    if (customArray.getWhat().equals("sum")) {
    
    }
    if (customArray.getWhat().equals("multiply")) {
      int result = 1;
      for (int i = 0; i < customArray.getArray().length; i++) {
      }
    }
    
    return customArray;
  }
}
  
}
