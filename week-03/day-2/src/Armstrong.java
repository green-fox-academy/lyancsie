import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    System.out.println("Give me a number: ");
    Scanner read = new Scanner(System.in);
    int x = read.nextInt();

    String xString = String.valueOf(x);
    int[] xArray = new int[xString.length()];
    int sum = 0;

    for (int i = 0; i < xString.length(); i++) {
      xArray[i] = (int) xString.charAt(i) - '0';
    }
    int tempSum = 1;
    for (int i = 0; i < xArray.length; i++) {
      for (int j = 0; j < xArray.length; j++) {
        tempSum *= xArray[i];
      }
      sum += tempSum;
      tempSum = 1;
    }

    if (sum == x) {
      System.out.println("Armstrong number.");
    } else System.out.println("Not an Armstrong number.");
  }
}

