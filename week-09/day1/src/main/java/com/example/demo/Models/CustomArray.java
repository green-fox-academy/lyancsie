package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomArray {
  
  private String what;
  private Integer[] array;
  
  public Integer decide() {
    if (what.equals("double"))
  }
  
  public Integer[] twoTimes() {
    for (int i = 0; i < array.length; i++) {
      DoubledValue temp = new DoubledValue(array[i]);
      array[i] = temp.getResult();
    }
    
  }
}
