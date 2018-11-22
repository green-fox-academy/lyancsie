package Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
  
  Fibonacci f = new Fibonacci();
  
  @Test
  void testingforOne() {
    assertEquals(0,f.fibonacci(1));
  }
  
  @Test
  void testingForTwo(){
    assertEquals(1,f.fibonacci(2));
  }
  
  @Test
  void testingForAGreatNumber(){
    assertEquals(17711,f.fibonacci(23));
  }
}