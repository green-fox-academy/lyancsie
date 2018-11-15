package String1;

import java.util.Scanner;

public class String1 {
  static int a;

  public static void main(String[] args) {
    System.out.println("Gimmie the text: ");
    Scanner read = new Scanner(System.in);
    String n = read.next();
    a = n.length() - 1;
    System.out.println(stringChanger(n, a));
  }

  private static String stringChanger(String input, int a) {

    if (a == 0) {
      input = 'y' + input.substring(a + 1);
      return input;
    } else {
      if (input.charAt(a) == 'x') {
        input = input.substring(0, a) + 'y' + input.substring(a + 1);
      }
      return stringChanger(input, a - 1);
    }
  }
}
