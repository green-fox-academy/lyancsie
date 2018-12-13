package com.greenfoxacademy.day4.Exercise1;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
  
  @Bean
  public String getMessage() {
    return "x3";
  }
}
