package String3;
// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

import java.util.Scanner;

public class String3 {
  public static void main(String[] args) {
    System.out.println("Gimmie the text: ");
    Scanner read = new Scanner(System.in);
    String n = read.next();
    int a = n.length();
    System.out.println(stringChanger(n, a));
  }
//string index out of range
  private static String stringChanger(String input, int a) {
    if (a == 0) {
      input = '*' + input.substring(a);
      return input;
    } else {
      input = input.substring(0, a) + '*' + input.substring(a);
      return stringChanger(input, a - 1);
    }
  }
}