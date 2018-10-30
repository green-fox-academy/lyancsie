import java.util.Scanner;
import java.lang.*;
public class DrawTriangle {
    public static void main(String[] args) {
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
        String star="*";
        Scanner reader = new Scanner(System.in);
        System.out.println("Number needed: ");
        int a = reader.nextInt();
        int lokal = 0;
        for(int i=1;i<=a;i++){
            System.out.println(star);
            star=star+"*";
            lokal=i;
            }
            if(lokal==a){
            for(int k=a;k>0;k--){
                star=star.substring(0, star.length() -1);
                System.out.println(star);
            }
        }
    }
}