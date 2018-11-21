package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  
  public static void main(String[] args) {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
  
    Collections.sort(dominoes);
    
    System.out.println(dominoes);
  
    Thing thing1 = new Thing("abc");
    Thing thing2 = new Thing ("are");
    Thing thing3 = new Thing ("qyz");
    Thing thing4 = new Thing ("Something important");
    
    Fleet fleet = new Fleet();
    
    fleet.add(thing1);
    thing1.complete();
    fleet.add(thing2);
    fleet.add(thing3);
    thing3.complete();
    fleet.add(thing4);
  
    System.out.println(fleet);
    
    Collections.sort(fleet.getThings());
  
    System.out.println(fleet);
  }
}
