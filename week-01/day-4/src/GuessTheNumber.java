import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  
  public static void main(String[] args) {
    Random rand = new Random();
    int number = rand.nextInt(5) + 1;
    Scanner read = new Scanner(System.in);
    System.out.print("Guess the number (from 1 to 5): ");
    int guess = read.nextInt();
    if (guess > number) {
      System.out.println("Your guess is bigger.");
    }
    if (guess < number) {
      System.out.println("Your guess is smaller");
    }
    if (guess == number) {
      System.out.println("Your guess is correct.");
    }
    System.out.println("The number is: " + number);
  }
}
