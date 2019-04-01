package greenfox.demo;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  
  String name;
  List<Trick> tricks = new ArrayList<>();
  String food;
  String drink;
  
  public Fox(String name, List<Trick> tricks, String food, String drink) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
  }
}
