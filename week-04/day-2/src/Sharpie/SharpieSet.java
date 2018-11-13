package Sharpie;

import java.util.List;
import java.util.ArrayList;

public class SharpieSet {
  List<Sharpie> ss = new ArrayList<>();

  Sharpie a = new Sharpie("white", 9);
  Sharpie b = new Sharpie("red", 80);
  Sharpie c = new Sharpie("yellow", 8000);
  Sharpie d = new Sharpie("reddish", 7);

  public SharpieSet(){
    ss.add(a);
    a.inkAmount=-10;
    ss.add(b);
    ss.add(c);
    ss.add(d);
  }

  public int countUsable() {
    int count = 0;
    for (int i = 0; i < ss.size(); i++) {
      if (ss.get(i).inkAmount >= 0) {
        count += 1;
      }
      //System.out.println(ss.get(i).inkAmount);
    }
    return count;
  }

  public void removeTrash() {
    for (int i = 0; i < ss.size(); i++)
      if (ss.get(i).inkAmount <= 0) {
        ss.remove(i);
      }
  }
}
