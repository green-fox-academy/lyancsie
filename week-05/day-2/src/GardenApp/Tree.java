package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Tree extends Plant{
  
  public Tree(String color) {
    super.efficiency = 0.4;
    super.needsWaterLimit=10;
    this.color = color;
  }
}
