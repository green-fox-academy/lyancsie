import java.util.Scanner;

public class OneTwoALot {
  
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Gimmie a number: ");
    int a = read.nextInt();
    if (a <= 0) {
      System.out.println("The number is too small");
    } else if (a == 1) {
      System.out.println("The number is ONE");
    } else if (a == 2) {
      System.out.println("The number is TWO");
    } else {
      System.out.println("The number is BIG");
    }
  }
}