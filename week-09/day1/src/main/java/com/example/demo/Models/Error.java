package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Error implements Serializable {
  
  private String error;
  
  public Error(String error) {
    this.error = error;
  }
}
