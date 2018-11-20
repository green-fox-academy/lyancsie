package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  
  List<Plant> myPlants = new ArrayList<>();
  
  public void watering(int amount) {
    System.out.println("Watering with " + amount);
    for (int i = 0; i < myPlants.size(); i++) {
      myPlants.get(i).amountOfWater += amount * myPlants.get(i).efficiency / myPlants.size();
    }
  }
  
  public void needsWater() {
    for (int i = 0; i < myPlants.size(); i++) {
      if (myPlants.get(i).amountOfWater > myPlants.get(i).needsWaterLimit) {
        System.out.println(myPlants.get(i).color + " doesn't need water");
      } else System.out.println(myPlants.get(i).color + " needs water");
    }
  }
}

