package com.greenfoxacademy.day4.Exercise1;

import com.greenfoxacademy.day4.Exercise1.Exercise2.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day4Application implements CommandLineRunner {
  
  @Autowired
  Printer printer;
  @Autowired
  MyColor redColor;
  @Autowired
  MyColor blueColor;
  
  public static void main(String[] args) {
    SpringApplication.run(Day4Application.class, args);
  }
  
  @Override
  public void run(String... args) throws Exception {
    printer.log("XXyz");
    redColor.printColor();
    blueColor.printColor();
  }
}

