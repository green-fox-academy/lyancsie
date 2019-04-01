package Examples;

import java.util.Collections;

public class MyExampleClass {
  
  static int a = 0;
  
  public static void main(String[] args) {
    a = 0;
    System.out.println(a);
    System.out.println(soutSomethingNice());
  }
  
  public static int soutSomethingNice() {
    a = 5;
    return a;
  }
}
