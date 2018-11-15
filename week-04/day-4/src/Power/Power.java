package Power;

public class Power {
  public static void main(String[] args) {
    System.out.println(power(5, 3));
  }

  private static int power(int n, int m) {
    if (m == 0) {
      return 1;
    } else {
      return (n * (power(n, m - 1)));
    }


  }
}
