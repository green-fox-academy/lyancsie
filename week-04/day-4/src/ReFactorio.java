import java.util.Scanner;

public class ReFactorio {
  public static void main(String[] args) {

    System.out.println("Gimmie the number: ");
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    System.out.println(reFactorio(n));
  }

  public static int reFactorio(int n) {
    if (n == 1) {
      return n;
    } else {
      return n * reFactorio(n - 1);
    }
  }
}
