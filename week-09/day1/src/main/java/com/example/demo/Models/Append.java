package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Append {
  
  private String appended;
  
  public Append(String toAppend) {
    appended = toAppend + "a";
  }
}
