package Bunnies2;

import java.util.Scanner;

public class Bunnies2 {
  public static void main(String[] args) {
    System.out.println("Gimmie the number: ");
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    System.out.println(earCounter(n));
  }

  private static int earCounter(int n) {
    if (n == 0) {
      return n;
    }
    if (n % 2 == 0) {
      return 3 + earCounter(n - 1);
    } else {
      return 2 + earCounter(n - 1);
    }


  }
}
