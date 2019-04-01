import java.util.Scanner;

public class DrawDiagonal {
  
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int howmany = read.nextInt();
    for (int i = 1; i <= howmany; i++) {
      System.out.print("%"); //writes the first line
    }
    
    System.out.println();
    String percent = "%";
    String space = "";
    String space2 = "";
    for (int i = 1; i <= howmany - 3; i++) {
      space2 = space2 + " "; //initialises space2
    }
    
    for (int i = 1; i <= howmany; i++) {
      System.out.println(percent + space + percent + space2 + percent);
      space = space + " ";
      if (space2.length() > 0) {
        space2 = space2.substring(0, space2.length() - 1);
      }
      
    }
    
    for (int i = 1; i <= howmany; i++) {
      System.out.print("%"); //writes the last line
    }
  }
}