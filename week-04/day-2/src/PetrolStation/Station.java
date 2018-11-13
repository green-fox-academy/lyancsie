package PetrolStation;

public class Station {
  float gasAmount = 3000;

  public void refill(Car c) {
    this.gasAmount -= 3;
    c.gasAmount += 3;
  }

}