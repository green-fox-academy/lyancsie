import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        //  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
        System.out.println("Tell me the number of inputs: ");

        Scanner read = new Scanner(System.in);
        int arg=read.nextInt();
        System.out.println(sum(arg));
        }

public static int sum(int a){
    Scanner read = new Scanner(System.in);
    int actual = 0;
    int sumInt= 0;
    for(int i=1;i<=a;i++) {
        System.out.println("Tell me the next number: ");
        actual = read.nextInt();
        sumInt = sumInt + actual;
    }
    return sumInt;
}
}
