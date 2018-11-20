package AircraftCarrier;

public abstract class Aircraft {
  
  private int maxAmmo;
  
  private int baseDmg;
  private int ammoStore;
  protected boolean priority;
  
  public int getAmmoStore() {
    return ammoStore;
  }
  
  public int getBaseDmg() {
    return baseDmg;
  }
  
  Aircraft() {
    ammoStore = 0;
    priority = false;
  }
  
  public Aircraft(int maxAmmo, int baseDmg, int ammoStore, boolean priority) {
    this.maxAmmo = maxAmmo;
    this.baseDmg = baseDmg;
    this.ammoStore = ammoStore;
    this.priority = priority;
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