package CharSequence;

public class Main {
  
  public static void main(String[] args) {
    Gnirts gnirt = new Gnirts("abcdefg");
  
    System.out.println(gnirt.charAt(2));
    System.out.println(gnirt.length());
    
    Shifter shifter = new Shifter("abcdefg");
  
    System.out.println(shifter.charAt(2));
    System.out.println(shifter.length());
  }
  
}
