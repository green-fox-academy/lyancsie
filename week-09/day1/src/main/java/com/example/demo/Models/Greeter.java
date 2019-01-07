package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeter {
  
  private String welcomeMessage;
  
  public Greeter(String name, String title) {
    welcomeMessage = "Oh, hi " + name + " my dear " + title;
  }
}
