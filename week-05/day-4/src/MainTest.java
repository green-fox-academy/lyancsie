import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
  
  @BeforeEach
  void setUp() {
    Object a = new Object();
  }
  
  @Test
  void posWithPos() {
    assertEquals(25, Main.multiplication(5, 5));
  }
  
  @Test
  void negWithPos() {
    assertEquals(-25, Main.multiplication(-5, 5));
  }
  
  @Test
  void negWithNeg() {
    assertEquals(25, Main.multiplication(-5, -5));
  }
  
  @Test
  void intentionalFail() {
    assertEquals(26, Main.multiplication(-5, -5));
  }
  
  @AfterEach
  void finalThings() {
    int x = 5;
  }
}