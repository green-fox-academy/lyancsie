package NumberAdder;

import java.util.Scanner;

public class NumberAdder {
  public static void main(String[] args) {
    System.out.println("Gimmie the number: ");
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    System.out.println(numberAdder(n));;
  }

  private static int numberAdder(int n) {
   if(n != 1) {
     return (n + numberAdder(n - 1));
   }
   else {
     return (n);
   }
   }

}
