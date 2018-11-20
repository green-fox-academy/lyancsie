package GardenApp;

public class Plant {
  
  String color;
  double amountOfWater;
  double efficiency;
  boolean needsWater;
  int needsWaterLimit;
  
  public Plant() {
    needsWaterLimit = 20;
    needsWater = true;
    efficiency = 1;
    amountOfWater = 0;
}
  public boolean needsWater() {
    return amountOfWater > needsWaterLimit;
  }
}

