package Bunnies;

import java.util.Scanner;

public class Bunnies {
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
public static void main(String[] args) {
  System.out.println("Gimmie the number: ");
  Scanner read = new Scanner(System.in);
  int n = read.nextInt();
  System.out.println(earCounter(n));
}
private static int earCounter(int n){

if(n==0){
  return n;
}
else{
  return(2+earCounter(n-1));
}

}


}


