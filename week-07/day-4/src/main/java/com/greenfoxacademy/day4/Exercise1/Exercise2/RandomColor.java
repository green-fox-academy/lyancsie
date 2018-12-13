package com.greenfoxacademy.day4.Exercise1.Exercise2;

import org.springframework.stereotype.Service;

@Service
public class RandomColor implements MyColor {
  
  @Override
  public void printColor() {
    System.out.println("This color is really random.");
  }
}
