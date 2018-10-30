import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.
    Scanner read = new Scanner(System.in);
    System.out.println("Gimmie a number: ");
    int a = read.nextInt();
    if(a%2==0){
        System.out.println("The number is even.");
    }
    else{
        System.out.println("The number is odd.");
}}}
