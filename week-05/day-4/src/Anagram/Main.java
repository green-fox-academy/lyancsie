package Anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  
  public static void main(String[] args) {
  
  }
  
  public boolean twoStringsAreAnagrams(String input1, String input2) {
    if (input1.length() != input2.length()) {
      return false;
    }
    char[] input1Char = input1.toCharArray();
    char[] input2Char = input2.toCharArray();
    
    Arrays.sort(input1Char);
    Arrays.sort(input2Char);
    
    for (int i = 0; i < input1Char.length; i++) {
      if (input1Char[i] != input2Char[i]) {
        return false;
      }
    }
    return true;
  }
}
