import java.util.Scanner;

public class PrintBigger {
  
  public static void main(String[] args) {
    
    // Write a program that asks for two numbers and prints the bigger one
    Scanner read = new Scanner(System.in);
    System.out.println("Gimmie a number: ");
    int a = read.nextInt();
    System.out.println("Gimmie a number: ");
    int b = read.nextInt();
    if (a > b) {
      System.out.println("a>b");
    } else if (a < b) {
      System.out.println("a<b");
    } else {
      System.out.println("a=b");
    }
  }
}