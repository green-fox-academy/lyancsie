package Apple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetAppleTest {
  
  @Test
  void getApple() {
    assertEquals("apple",Apple.getApple());
  }
}