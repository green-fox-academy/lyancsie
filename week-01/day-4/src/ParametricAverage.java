import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int sum = 0;
    int actual = 0;
    System.out.println("Gimmie the number of values: ");
    int howMany = read.nextInt();
    for (int i = 1; i <= howMany; i++) {
      System.out.print("Give me a number: ");
      sum += read.nextInt();
    }
    System.out.println("The sum is: " + sum);
    System.out.println("The average is: " + (float) sum / howMany);
  }
}