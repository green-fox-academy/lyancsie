package main.java.music;

public class BassGuitar extends StringedInstrument {
  
  public BassGuitar() {
    super(4, "Duum-duum-duum");
  }
  
  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    mySound = "Duum-duum-duum";
  }
}
