package com.greenfoxacademy.day4.Exercise1.Exercise2;

import org.springframework.stereotype.Service;

@Service
public class BlackColor implements MyColor {
  
  @Override
  public void printColor() {
    System.out.println("Haha");
  }
}
