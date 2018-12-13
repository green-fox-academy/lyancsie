package com.greenfoxacademy.day4.Exercise1.Exercise3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  
  ArrayList<String> colors;
  Random random;
  
  public boolean validateMail(String address) {
    return (address.contains("@") && (address.contains(".")));
  }
  
  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }
  
  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }
  
  public String caesar(String text, int number) {
    if (number < 0) {
      number = 26 + number;
    }
    
    String result = "";
    for (int i = 0; i < text.length(); i++) {
      int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
      result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
    }
    return result;
  }
}