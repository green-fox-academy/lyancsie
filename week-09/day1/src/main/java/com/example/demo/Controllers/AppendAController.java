package com.example.demo.Controllers;

import com.example.demo.Models.Append;
import com.example.demo.Models.Error;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {
  
  @GetMapping("/appenda/{appendable}")
  public Object append(@PathVariable(required = false) String appendable) {
    //f (appendable != null) {
    return new Append(appendable);
    //}
    // return new Error("No appendable was added"); --> does not wok this way, new endpoint needed
  }
  
  @GetMapping("/appenda/")
  public Object appendDefault() {
    return new Error("No appendable was added");
  }
}
