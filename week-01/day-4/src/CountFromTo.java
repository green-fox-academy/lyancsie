import java.util.Scanner;

public class CountFromTo {
  
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Gimmie a number: ");
    int a = reader.nextInt();
    System.out.println("Gimmie a number: ");
    int b = reader.nextInt();
    if (!(b > a)) {
      System.out.println("The 2nd number is not big enough");
    } else {
      for (int i = a; i <= b; i++) {
        System.out.println(i);
      }
      
    }
  }
  
}
