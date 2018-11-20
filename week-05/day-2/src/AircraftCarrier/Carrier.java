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
        aSquad.refill(ammoToFill);
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
      if (ammo > 0) {
        if (this.ammo >= aSquad.getAmmoStore()) {
            if (aSquad.isPriority()) {
              aSquad.refill(ammo);
              this.ammo -= aSquad.getAmmoStore();
              ammo -= aSquad.getAmmoStore();
            }
          }
        }
      }
    
    for (Aircraft aSquad : squad) {
      if (ammo > 0) {
        if (this.ammo >= aSquad.getAmmoStore()) {
          aSquad.refill(ammo);
          ammo -= aSquad.getAmmoStore();
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
    if (hitPoints <= 0) {
      System.out.println("Dead :'(");
    } else {
      for (Aircraft aSquad : squad) {
        maxDmg += aSquad.getAmmoStore() * aSquad.getBaseDmg();
        aSquad.getStatus();
      }
      System.out.println("Type: " + getClass().getName() + " Aircraft count: " + squad.size() + " Ammo storage: " + ammo + " Total damage: " + maxDmg);
    }
  }
}