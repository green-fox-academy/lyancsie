package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  
  private int storeOfAmmo;
  private int hitPoints;
  
  public int getAmmo() {
    
    return storeOfAmmo;
  }
  
  public void setAmmo(int ammoToFill) {
    if (this.storeOfAmmo > 0) {
      for (Aircraft aSquad : squad) {
        aSquad.refill(ammoToFill);
      }
    }
  }
  
  private List<Aircraft> squad;
  
  Carrier(int carrierAmmo, int hitPoints) {
    this.hitPoints = hitPoints;
    this.storeOfAmmo = carrierAmmo;
    squad = new ArrayList<Aircraft>();
  }
  
  void add(Aircraft newAircraft) {
    
    squad.add(newAircraft);
  }
//TODO fill
  void fill() {
    
    for (Aircraft aSquad : squad) {
      if (storeOfAmmo > 0) {
        if (aSquad.isPriority()) {
          storeOfAmmo -= aSquad.getMaxAmmo() - aSquad.getAmmoStore();
          aSquad.refill(storeOfAmmo);
          if (storeOfAmmo <= 0) {
            break;
          }
        }
      }
    }
    
    for (Aircraft aSquad : squad) {
      if (storeOfAmmo > 0) {
        if (!aSquad.isPriority())
          storeOfAmmo -= aSquad.getMaxAmmo() - aSquad.getAmmoStore();
        aSquad.refill(storeOfAmmo);
        if (storeOfAmmo <= 0) {
          break;
        }
      }
    }
  }
//TODO fight
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
      System.out.println("Type: " + getClass().getName() + " Aircraft count: " + squad.size() + " Ammo storage: " + storeOfAmmo + " Total damage: " + maxDmg);
    }
  }
}