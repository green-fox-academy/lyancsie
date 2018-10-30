import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Pls write the distance in kms: ");
        Scanner read = new Scanner(System.in);
        double km = read.nextDouble();
        double mile = km * (0.621371);
        System.out.println("The distance in miles: " + mile);
    }
}