package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoubledValue {
  
  private Integer original;
  private Integer result;
  
  public DoubledValue(Integer original) {
    this.original = original;
    result = original * 2;
  }
}