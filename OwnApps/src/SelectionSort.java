import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Smaller to bigger: 0; Bigger to smaller: 1");
        int biggerToSmaller = read.nextInt();
        System.out.println("Gimmie the number of values: ");
        int size = read.nextInt();
        int[] x = new int[size];
        for (int i = 0; i < x.length; i++) {
            System.out.println("Gimmie the next number: ");
            x[i] = read.nextInt();
        }
        System.out.println("The original array: " + x);
        if (biggerToSmaller == 0) {
            System.out.println("The sorted array: " + Arrays.toString(selectionSort(x, false)));
        }
        if (biggerToSmaller == 1) {
            System.out.println("The sorted array: " + Arrays.toString(selectionSort(x, true)));
        }
    }


    public static int[] selectionSort(int[] input, boolean biggerToSmaller) {
        int temp = 2147483647;
        int index = 0;
        //for (int j=0; j<input.length;j++) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] < temp) {
                temp = input[i];}
                for(int j=i+1; j<input.length;j++){
                    input[i]=input[j];
                    input[j]=temp;
                    temp=2147483647;
                    break;
                }
            }
        return input;
    }
}



