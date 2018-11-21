package CharSequence;

public class Shifter implements CharSequence {
  
  String x;
  
  public Shifter(String x) {
    this.x = x;
  }
  
  @Override
  public int length() {
    return x.length();
  }
  
  @Override
  public char charAt(int index) {
    return x.charAt(index);
  }
  
  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
