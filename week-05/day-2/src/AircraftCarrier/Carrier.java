package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  
  int ammo;
  List<Aircraft> squad = new ArrayList<Aircraft>();
  
  public Carrier(int ammo) {
    this.ammo = ammo;
  }
  
  public void add(Aircraft newAircraft) {
    squad.add(newAircraft);
  }
  
  public void fill() {
    for (int i = 0; i < squad.size(); i++) {
      try {
        if (squad.get(i).priority) {
          squad.get(i).refill();
        }
        squad.get(i).refill();
      } catch (Exception)
      {
        System.out.println("Error: not enough ammo to fill all aircrafts");
      }
    }
    
  }
  
  public void fight(Carrier enemy) {
    for (int i = 0; i < squad.size(); i++) {
      squad.get(i).fight();
    }
  }
}
