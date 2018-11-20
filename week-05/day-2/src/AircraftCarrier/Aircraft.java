package AircraftCarrier;

public abstract class Aircraft {
  
  int maxAmmo;
  int baseDmg;
  int ammoStore;
  protected boolean priority;
  
  Aircraft() {
    ammoStore = 0;
    priority = false;
  }
  
  void refill() {
    ammoStore = maxAmmo;
  }
  
  private String getType() {
    return getClass().getSimpleName();
  }
  
  void getStatus() {
    System.out.println("Type: " + getType() + " Ammo: " + ammoStore + " Base dmg: " + baseDmg + " All damage: " + baseDmg * ammoStore);
  }
  
  boolean isPriority() {
    return priority;
  }
}