package AircraftCarrier;

public class Main {
  
  public static void main(String[] args) {
    Carrier c1 = new Carrier(500, 7500);
    Carrier c2 = new Carrier(250, 4800);
    
    for (int i = 0; i < 30; i++) {
      Aircraft a1 = new F16();
      c1.add(a1);
    }
    
    for (int i = 0; i < 20; i++) {
      Aircraft a1 = new F35();
      c2.add(a1);
    }
    
    c1.fill(40);
    c2.fill(48);
    
    c1.getStatus();
    c2.getStatus();
    
    // c1.getStatus();
    // c2.getStatus();
    
    c1.fight(c2);
    c2.fight(c1);
    
  }
  
}