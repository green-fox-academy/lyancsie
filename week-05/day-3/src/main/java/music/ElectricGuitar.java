package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  
  String name = getClass().toString();
  
  public ElectricGuitar() {
    super(6, "Twang");
  }
  
  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
    mySound = "Twang";
  }
}
