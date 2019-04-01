import java.util.Scanner;

public class SecondsInADay {
  
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Current hours: ");
    int currentHours = read.nextInt();
    System.out.println("Current minutes: ");
    int currentMinutes = read.nextInt();
    System.out.println("Current seconds: ");
    int currentSeconds = read.nextInt();
    
    int totalTime = 24 * 60 * 60;
    int passedTime = (currentSeconds + currentMinutes * 60 + currentHours * 60 * 60);
    int remainingTime = totalTime - passedTime;
    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
    System.out.println("The remaining time from the day is: " + remainingTime);
  }
}