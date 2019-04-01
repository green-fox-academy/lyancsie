import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HandTest {
  
  Hand testHand;
  
  @BeforeEach
  void setUp() {
    testHand = new Hand();
  }
  
  @Test
  void highestCardTest1() {
    testHand.hand.add(new Card("10", "hearts"));
    testHand.hand.add(new Card("J", "diamonds"));
    testHand.hand.add(new Card("1", "hearts"));
    testHand.hand.add(new Card("7", "hearts"));
    testHand.hand.add(new Card("Q", "hearts"));
    
    Assertions.assertEquals("Q", testHand.highestCard().get(0).valueAsString);
  }
  
  @Test
  void highestCardTest2() {
    testHand.hand.add(new Card("1", "hearts"));
    testHand.hand.add(new Card("3", "diamonds"));
    testHand.hand.add(new Card("A", "spades"));
    testHand.hand.add(new Card("Q", "diamonds"));
    testHand.hand.add(new Card("9", "hearths"));
    
    Assertions.assertEquals("A", testHand.highestCard().get(0).valueAsString);
    
  }
}