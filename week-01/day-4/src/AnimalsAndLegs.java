import java.util.Scanner;

public class AnimalsAndLegs {
  
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
    Scanner read = new Scanner(System.in);
    System.out.println("Enter the number of pigs: ");
    int pigs = read.nextInt();
    System.out.println("Enter the number of chickens: ");
    int chickens = read.nextInt();
    int legs = (pigs * 4 + chickens * 2);
    System.out.println(legs);
  }
}