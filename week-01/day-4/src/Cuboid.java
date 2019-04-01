import java.util.Scanner;

// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
// 
// Surface Area: 600
// Volume: 1000
public class Cuboid {
  
  public static void main(String[] args) {
    System.out.println("a = ");
    Scanner read = new Scanner(System.in);
    int a = read.nextInt();
    System.out.println("b = ");
    int b = read.nextInt();
    System.out.println("c = ");
    int c = read.nextInt();
    System.out.println("Surface: " + a * b);
    System.out.println("Volume: " + a * b * c);
  }
}