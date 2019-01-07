package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomArray {
  
  private String what;
  private Integer[] array;
  private Object result;
  
  public void decide() {
    if (what.equals("multiply")) {
      multiply();
    }
    if (what.equals("sum")) {
      sum();
    }
    if (what.equals("double")) {
      twoTimes();
    }
  }
  
  private void twoTimes() {
    int[] resultArray = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      DoubledValue temp = new DoubledValue(array[i]);
      resultArray[i] = temp.getResult();
    }
    result = resultArray;
  }
  
  private void multiply() {
    int i = 1;
    for (int j = 0; j < array.length; j++) {
      i *= array[j];
    }
    result = i;
  }
  
  private void sum() {
    int i = 0;
    for (int j = 0; j < array.length; j++) {
      i += array[j];
    }
    result = i;
  }
}
