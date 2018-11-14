package Animal; //nullPointerException in Farm (thus in main as well)

public class Main {
  public static void main(String[] args) {
    Animal dog = new Animal();
    dog.eat();
    System.out.println(dog.hunger);
    dog.drink();
    System.out.println(dog.thirst);
    dog.play();
    System.out.println(dog.hunger + " " + dog.thirst);

    Farm myFarm = new Farm();
    myFarm.breed();
    myFarm.breed();
    myFarm.breed();
    myFarm.breed();

    myFarm.slaughter();
    myFarm.slaughter();
    myFarm.slaughter();

  }


}
