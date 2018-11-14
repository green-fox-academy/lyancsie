package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> crew = new ArrayList<Pirate>();

  public void FillShip() {
    Random rand = new Random();
    Pirate Cap = new Pirate();
    Cap.isCaptain = true;

    crew.add(Cap);                    //adds the Captain to the crew

    int n = rand.nextInt(10) + 2;

    for (int i = 0; i < n; i++) {
      Pirate newP = new Pirate();     //fills the crew with pirates
      crew.add(newP);
    }
  }

  public String captainStatus() {

    String status = "";

    for (int i = 0; i < crew.size(); i++) { //getCaptain
      if (crew.get(i).isCaptain) {
        String state = "";
        if (crew.get(i).state == 0) {
          state = "alive";
        }
        if (crew.get(i).state == 1) {
          state = "passed out";
        }
        if (crew.get(i).state == 2) {
          state = "dead";
        }
        if (crew.get(i).isCaptain) {
          status = "Consumed rum: " + crew.get(i).getCount() + ", status: " + state;
        }
      }
    }

    return status;
  }

  public boolean battle(Ship otherShip) {
    int thisPts = 0;
    int otherPts = 0;

    for (int i = 0; i < this.crew.size(); i++) {
      if (crew.get(i).state == 0 || crew.get(i).state == 1) {
        thisPts += 1;
      }
      for (int j = 0; j < this.crew.size(); j++) {
        if (crew.get(i).isCaptain) {
          thisPts -= crew.get(i).getCount();
          break;
        }
      }
    }
    for (int i = 0; i < otherShip.crew.size(); i++) {
      if (otherShip.crew.get(i).state == 0 || otherShip.crew.get(i).state == 1) {
        otherPts += 1;
        if (otherShip.crew.get(i).isCaptain) {
          thisPts -= otherShip.crew.get(i).getCount();
          break;
        }
      }
    }
    if (thisPts > otherPts) {
      Random r = new Random();
      int x = r.nextInt(5) + 1;
      for (int i = 0; i < x; i++) {
        this.crew.remove(i);
      }
      return true;
    } else {
      Random r = new Random();
      int x = r.nextInt(5) + 1;
      for (int i = 0; i < x; i++) {
        otherShip.crew.remove(i);
      }

      return false; //if they're equal, this also loses
    }

  }
}
