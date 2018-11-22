package Anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class twoStringsAreAnagramsTest {
  
  Main mainTest = new Main();
  
  @BeforeEach
  void setUp(){
  
  }
  
  @Test
  void simpleCase() {
    assertTrue(mainTest.twoStringsAreAnagrams("abc", "bca"));
  }
  
  @Test
  void multipleCommonLetters(){
    assertTrue(mainTest.twoStringsAreAnagrams("wawww", "wwaww"));
  }
  
  @Test
  void subtleDifference(){
    assertFalse(mainTest.twoStringsAreAnagrams("xxxxxx", "xxaxxx"));
  }
  @Test
  void lastCharacterMismatch(){
    assertFalse(mainTest.twoStringsAreAnagrams("aaaaa","aaaab"));
  }
  @Test
  void differentLength(){
    assertFalse(mainTest.twoStringsAreAnagrams("aaaaa","aaaaaa"));
  }
}