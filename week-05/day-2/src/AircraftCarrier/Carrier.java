package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  
  private int ammo;
  private int hitPoints;
  
  private List<Aircraft> squad;
  
  Carrier(int ammo, int hitPoints) {
    this.hitPoints = hitPoints;
    this.ammo = ammo;
    squad = new ArrayList<Aircraft>();
  }
  
  void add(Aircraft newAircraft) {
    
    squad.add(newAircraft);
  }
  
  public void fill() {
    for (Aircraft aSquad : squad) {
      try {
        if (aSquad.isPriority()) {
          aSquad.refill();
        }
        aSquad.refill();
      } catch (Exception x) {
        System.out.println("Error: not enough ammo to fill all aircrafts");
      }
    }
    
  }
  
  void fight(Carrier enemy) {
    for (Aircraft aSquad : squad) {
      enemy.hitPoints -= aSquad.ammoStore * aSquad.baseDmg;
    }
  }
  
  void getStatus() {
    int maxDmg = 0;
    for (Aircraft aSquad : squad) {
      maxDmg += aSquad.ammoStore * aSquad.baseDmg;
    }
    System.out.println("Type: " + getClass().getName() + " Aircraft count: " + squad.size() + " Ammo storage: " + ammo + " Total damage: " + maxDmg);
    for (Aircraft aSquad : squad) {
      aSquad.getStatus();
    }
  }
}
