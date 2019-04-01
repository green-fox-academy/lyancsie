import java.util.Scanner;

public class AverageOfInput {
  
  public static void main(String[] args) {
    System.out.println("Give me how many numbers you'll write: ");
    Scanner read = new Scanner(System.in);
    int k = read.nextInt();
    int sum = 0;
    for (int i = 1; i <= k; i++) {
      
      System.out.println("Give me a number: ");
      int y = read.nextInt();
      sum = sum + y;
    }
    System.out.println("The sum is: " + sum);
    System.out.println("The avg is: " + (double) sum / k);
  }
}