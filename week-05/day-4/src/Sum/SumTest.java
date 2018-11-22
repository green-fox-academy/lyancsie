package Sum;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
  
  ArrayList<Integer> testList;
  Sum mySum = new Sum();
  
  @BeforeEach
  void setUp() {
    testList = new ArrayList<Integer>();
  }
  
  @Test
  void positiveNumbers() {
    testList.add(5);
    testList.add(10);
    testList.add(100);
    assertEquals(115, mySum.sum(testList));
  }
  
  @Test
  void negativeNumbers() {
    testList.add(-25);
    testList.add(-25);
    testList.add(-100);
    testList.add(-200);
    assertEquals(-350, mySum.sum(testList));
  }
  
  @Test
  void mixedNumbers() {
    testList.add(-25);
    testList.add(100);
    testList.add(-50);
    assertEquals(-25, mySum.sum(testList));
  }
  
  @Test
  void someNullsAdded() {
    testList.add(null);
    testList.add(25);
    testList.add(10);
    assertEquals(java.lang.NullPointerException, mySum.sum(testList));
    
  }
  
}