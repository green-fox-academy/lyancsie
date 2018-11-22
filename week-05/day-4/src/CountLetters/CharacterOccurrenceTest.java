package CountLetters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CharacterOccurrenceTest {
  
  HashMap<Character, Integer> expectedMap;
  HashMap<Character, Integer> testMap;
  String testText;
  
  @BeforeEach
  void setUp() {
    
    expectedMap = new HashMap<>();
    
  }
  
  @Test
  void textEasyAssertEquals() {
    expectedMap.put('E', 1);
    expectedMap.put('a', 1);
    expectedMap.put('s', 1);
    expectedMap.put('y', 1);
    assertEquals(expectedMap, CharacterOccurrence.evaluateOccurrences("Easy"));
  }
  
  @Test
  void testEasyAssertFalse(){
    expectedMap.put('E', 1);
    expectedMap.put('a', 1);
    expectedMap.put('s', 1);
    expectedMap.put('y', 1);
    assertNotEquals(expectedMap, CharacterOccurrence.evaluateOccurrences("Hard"));
  }
  
  @Test
  void testIntentionallyNotWorking(){
    expectedMap.put('E', 1);
    expectedMap.put('a', 1);
    expectedMap.put('s', 1);
    expectedMap.put('y', 1);
    assertEquals(expectedMap, CharacterOccurrence.evaluateOccurrences("Hard"));
  }
  
  @Test
  void occurrenceMismatch(){
    expectedMap.put('E',2);
    expectedMap.put('a',1);
    expectedMap.put('s', 1);
    expectedMap.put('y', 1);
    assertNotEquals(expectedMap, CharacterOccurrence.evaluateOccurrences("Easy"));
  }
}