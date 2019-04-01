package Comparable;

import Printable.Printable;

import java.util.ArrayList;

public class Fleet implements Comparable, Printable {
  
  private ArrayList<Thing> things;
  
  public ArrayList<Thing> getThings() {
    return things;
  }
  
  public Fleet() {
    things = new ArrayList<>();
  }
  
  public void add(Thing thing) {
    things.add(thing);
  }
  
  @Override
  public String toString() {
    String result = "";
    for (int i = 0; i < things.size(); i++) {
      result += (i + 1) + ". " + things.get(i) + "\n";
    }
    return result;
  }
  
  @Override
  public int compareTo(Object o) {
    return 0;
  }
  
  @Override
  public void printAllFields() {
  
  }
}

