package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoUntil {
  
  private Integer result;
  
  public DoUntil(int number, String type) {
    if (type.equals("sum")) {
      result = 0;
      for (int i = 1; i <= number; i++) {
        result += i;
      }
    }
    if (type.equals("factor")) {
      result = 1;
      for (int i = 1; i <= number; i++) {
        result *= i;
      }
    }
    if (!(type.equals("sum")) && !(type.equals("factor"))) {
      result = null;
    }
  }
}
