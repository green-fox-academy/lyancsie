package com.greenfoxacademy.day4.Exercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day4Application implements CommandLineRunner {
  
  @Autowired
  Printer printer;
  
  public static void main(String[] args) {
    SpringApplication.run(Day4Application.class, args);
  }
  
  @Override
  public void run(String... args) throws Exception {
    printer.log("XXyz");
    
  }
}

