package com.greenfoxacademy.day4.Exercise1;

import com.greenfoxacademy.day4.Exercise1.Exercise2.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day4Application implements CommandLineRunner {
  
  Printer printer;
  MyColor redColor;
  MyColor blueColor;
  MyColor randomColor;
  MyColor blackColor;
  MyColor brown;
  
  @Autowired
  public Day4Application(Printer printer, MyColor redColor, MyColor blueColor, MyColor randomColor, MyColor blackColor, MyColor brown) {
    this.blackColor = blackColor;
    this.blueColor = blueColor;
    this.randomColor = randomColor;
    this.printer = printer;
    this.redColor = redColor;
    this.brown = brown;
  }
  
  public static void main(String[] args) {
    SpringApplication.run(Day4Application.class, args);
  }
  
  @Override
  public void run(String... args) throws Exception {
    
    printer.printColor();
    redColor.printColor();
    blueColor.printColor();
    randomColor.printColor();
    blackColor.printColor();
    brown.printColor();
  }
}

