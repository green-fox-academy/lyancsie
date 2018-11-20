package AircraftCarrier;

public abstract class Aircraft {
  
  int maxAmmo;
  int baseDmg;
  int ammoStore;
  boolean priority;
  
  public Aircraft() {
    ammoStore = 0;
    priority=false;
  }
  
  public void fight(Aircraft opponent) {
  
  }
  
  public void refill() {
    ammoStore = maxAmmo;
  }
  
  public String getType() {
    return getClass().getSimpleName();
  }
  
  public void getStatus() {
    System.out.println("Type: " + getType() + "Ammo: " + ammoStore + "Base dmg: " + baseDmg + " All damage: " + baseDmg*ammoStore);
  }
  
  public boolean isPriority() {
    return priority;
  }
}