package main.java.music;

public abstract class StringedInstrument extends Instrument {
  
  int numberOfStrings;
  String mySound = "";
  
  String sound(String mySound) {
    return mySound;
  }
  
  public StringedInstrument(int numberOfStrings, String mySound) {
    this.numberOfStrings = numberOfStrings;
    this.mySound = mySound;
  }
  
  @Override
  public void play() {
    System.out.println(mySound + name + numberOfStrings);
  }
  
  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    sound(mySound);
  }
  
  public StringedInstrument() {
  }
}