package Animal;

import java.util.List;

public class Farm {
  List<Animal> animals;
  int slots = 10;

  public void breed() {
    if (animals.size() != 0) {
      if (animals.size() < slots) {
        Animal a = new Animal();
        a.hunger = 10;
        animals.add(a);
      }
    }
  }

  public void slaughter() {
    int leastIndex = 0;
    for (int i = 0; i < animals.size(); i++) {
      if (animals.get(i).hunger < animals.get(leastIndex).hunger) {
        leastIndex = i;
      }
    }
    animals.remove(leastIndex);
    System.out.println(leastIndex);
  }

}

