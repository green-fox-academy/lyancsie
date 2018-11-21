package AircraftCarrier;

public class Main {
  
  public static void main(String[] args) {
    Carrier c1 = new Carrier(53, 12001);
    //System.out.println(c1.getAmmo());
    Carrier c2 = new Carrier(200, 12000);
    //System.out.println(c2.getAmmo());
    
    for (int i = 0; i < 5; i++) {
      Aircraft a1 = new F16();
      c1.add(a1);
    }
    Aircraft a2 = new F35();
    c1.add(a2);
    for (int i = 0; i < 20; i++) {
      Aircraft a1 = new F35();
      c2.add(a2);
    }
    
    c1.fill();
    c2.fill();
    
    c1.fight(c2);
    c2.fight(c1);
    
    c1.getStatus();
    c2.getStatus();
  }
}