public class Swap {
  public static void main(String[] args) {
    // Swap the values of the variables
    int a = 123;
    int b = 526;
    System.out.println(a);
    System.out.println(b);
    int c = a; //a = b
    a = b;
    b = c; //b = c = old a
    System.out.println(a);
    System.out.println(b);
  }
}
