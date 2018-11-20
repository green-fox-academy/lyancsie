package GardenApp;

public class Flower extends Plant {
  
  public Flower(String color) {
    super.efficiency=0.75;
    super.needsWaterLimit = 5;
    this.color = color;
  }
}
