package CharSequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  
  String field;
  
  public Gnirts(String field) {
    this.field = field;
  }
  
  @Override
  public int length() {
    return field.length();
  }
  
  @Override
  public char charAt(int index) {
    return field.charAt(length()-index-1);
  }
  
  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
  
  @Override
  public IntStream chars() {
    return null;
  }
  
  @Override
  public IntStream codePoints() {
    return null;
  }
}
