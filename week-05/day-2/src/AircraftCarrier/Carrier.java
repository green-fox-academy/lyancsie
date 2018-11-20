package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  
  private int ammo;
  private int hitPoints;
  
  public int getAmmo() {
    return ammo;
  }
  
  public void setAmmo(int ammoToFill) {
    while (this.ammo > 0) {
      for (Aircraft aSquad : squad) {
        aSquad.refill();
      }
    }
  }
  
  private List<Aircraft> squad;
  
  Carrier(int ammo, int hitPoints) {
    this.hitPoints = hitPoints;
    this.ammo = ammo;
    squad = new ArrayList<Aircraft>();
  }
  
  void add(Aircraft newAircraft) {
    
    squad.add(newAircraft);
  }
  
  public void fill(int ammo) {
    
    for (Aircraft aSquad : squad) {
      if (ammo > 0 && this.ammo > 0) {
        try {
          if (aSquad.isPriority()) {
            aSquad.refill();
            this.ammo -= aSquad.getAmmoStore();
            ammo -= aSquad.getAmmoStore();
          }
          aSquad.refill();
        } catch (Exception x) {
          System.out.println("Error: not enough ammo to fill all aircrafts");
        }
      }
    }
  }
  
  void fight(Carrier enemy) {
    for (Aircraft aSquad : squad) {
      enemy.hitPoints -= aSquad.getAmmoStore() * aSquad.getBaseDmg();
    }
  }
  
  void getStatus() {
    int maxDmg = 0;
    for (Aircraft aSquad : squad) {
      maxDmg += aSquad.getAmmoStore() * aSquad.getBaseDmg();
    }
    System.out.println("Type: " + getClass().getName() + " Aircraft count: " + squad.size() + " Ammo storage: " + ammo + " Total damage: " + maxDmg);
    for (Aircraft aSquad : squad) {
      aSquad.getStatus();
    }
  }
}
