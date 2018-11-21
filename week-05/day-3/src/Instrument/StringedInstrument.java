package Instrument;

public abstract class StringedInstrument extends Instrument {
  
  int numberOfStrings;
  
  void sound(String sound){
  
  }
  
  
  public StringedInstrument(int numberOfStrings, String sound){
  this.numberOfStrings = numberOfStrings;
  sound(sound);
  }
  
  
}
