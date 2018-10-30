import java.util.Scanner;
public class ParametricAverage {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int sum=0;
        int actual=0;
        System.out.println("Gimmie the number of values: ");
        int howmany=read.nextInt();
        for(int i=1;i<=howmany;i++){
            System.out.print("Give me a number: ");
            actual=read.nextInt();
            sum=sum+actual;
        }
        System.out.println("The sum is: " + sum);

        float avg= (float) sum/howmany;
        System.out.println("The average is: "+ avg);
    }
}