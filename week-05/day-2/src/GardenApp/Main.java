package GardenApp;

public class Main {
  
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    
    Plant yellow = new Flower("yellow");
    Plant blue = new Flower("blue");
    Plant purple = new Tree("purple");
    Plant orange = new Tree("orange");
    
    myGarden.myPlants.add(yellow);
    myGarden.myPlants.add(blue);
    myGarden.myPlants.add(purple);
    myGarden.myPlants.add(orange);
  
    myGarden.needsWater();
    myGarden.watering(40);
    myGarden.needsWater();
    myGarden.watering(70);
    myGarden.needsWater();
  }
  
}
