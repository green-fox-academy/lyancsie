package SumDigit;

import java.util.Scanner;

public class SumDigit {
  public static void main(String[] args) {
    System.out.println("Gimmie the number: ");
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    System.out.println(sumDigit(n));
  }

  private static int sumDigit(int n) {
    if (n == 0) {
      return n;
    } else {
      return (n % 10 + sumDigit(n / 10)); // 1 + 2; 1 + 2 + 5
    }
  }
}