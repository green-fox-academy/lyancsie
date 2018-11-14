package Pirates;

public class Main {
  public static void main(String[] args) {
    Pirate p1 = new Pirate();
    Pirate p2 = new Pirate();
    Pirate p3 = new Pirate();

    p1.drinkSomeRum();   //works
    p2.die();
    //p2.drinkSomeRum();  //test for die --> works

    p1.brawl(p3);

    p1.drinkSomeRum(); //test for brawl --> works
    p3.drinkSomeRum();

    Ship ship = new Ship();

    ship.FillShip();
    System.out.println(ship.captainStatus());
  }


}
