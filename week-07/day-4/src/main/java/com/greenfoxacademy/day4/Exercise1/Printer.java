package com.greenfoxacademy.day4.Exercise1;

import com.greenfoxacademy.day4.Exercise1.Exercise2.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer implements MyColor {
  
  String message;
  
  @Autowired
  public Printer(String message) {
    this.message = message;
  }
  
  @Override
  public void printColor() {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS " + message);
  }
}