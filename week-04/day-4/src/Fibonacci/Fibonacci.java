package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("Gimmie the number: ");
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    System.out.println(fibonacci(n));
  }

  public static int fibonacci(int n) {
    if (n == 2) {
      return 1;
    } else if (n == 1) {
      return 0;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}
