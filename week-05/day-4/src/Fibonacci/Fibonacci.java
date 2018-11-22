package Fibonacci;

public class Fibonacci {
  
  public static void main(String[] args) {
  
  }
  
  public int fibonacci(int index){
    if (index == 2) {
      return 1;
    } else if (index == 1) {
      return 0;
    } else {
      return fibonacci(index - 1) + fibonacci(index - 2);
    }
  }
  
}
