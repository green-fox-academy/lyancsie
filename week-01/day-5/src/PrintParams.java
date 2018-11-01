import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;

public class PrintParams {
    Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many?");
        Scanner read = new Scanner(System.in);
        int i = read.nextInt();
        System.out.println(Arrays.toString(printParams(i)));
    }

    public static String[] printParams(int howMany) {
        Scanner read = new Scanner(System.in);
        String myArray[] = new String[howMany];
        for (int i = 0; i < howMany; i++) {
            myArray[i] = read.next();
        }
        return myArray;
        //I couldn't return it in string directly, because the output is an array
        //magic was needed, it was just a hash
    }
}
