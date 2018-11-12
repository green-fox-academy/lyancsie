import java.util.*;
public class DivideByZero {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Gimmie the number: ");
        int divisor=read.nextInt();
        System.out.println(divide(divisor));
    }

    public static int divide(int x){
       try {
            return 10/x;
        }
        catch(ArithmeticException e){

            System.out.println("Error: divison by zero");
        }
        finally {return 10/x;}
    }
}
