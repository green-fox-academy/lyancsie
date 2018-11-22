package CountLetters;

import java.util.Arrays;
import java.util.HashMap;

public class CharacterOccurrence {
  
  public static void main(String[] args) {
  
  }
  
  public static HashMap occurrenceOutput(String input) {
    HashMap<Character, Integer> occurrence = new HashMap<>();
    
    for (int i = 0; i < input.length(); i++) {
      if (!occurrence.containsKey(input.charAt(i))) {
        occurrence.put((input.charAt(i)), 1);
      } else {
        occurrence.put((input.charAt(i)), occurrence.get((Character.getNumericValue(input.charAt(i))) + 1));
      }
    }
    return occurrence;
  }
}
