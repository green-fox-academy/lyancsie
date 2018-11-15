package Counter;

import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    System.out.println("Gimmie the number: ");
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    counter(n);
  }
  private static int counter(int n){
    System.out.println(n);
    if(n==1){
      return 1;
    }
    else{counter(n-1);}
    return n;
  }
}
