import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hand implements Comparable {
  
  List<Card> hand = new ArrayList<>();
  
  List<Card> highestCard() {
    return hand.stream().sorted().collect(Collectors.toList());
  }
  
  @Override
  public int compareTo(Object o) {
  
  }
}