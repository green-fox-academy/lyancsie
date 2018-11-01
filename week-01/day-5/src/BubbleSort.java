import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Smaller to bigger: 0; Bigger to smaller: 1");
        int biggerToSmaller=read.nextInt();
        System.out.println("Gimmie the number of values: ");
        int size=read.nextInt();
        int[] x = new int[size];
        for(int i = 0; i<x.length;i++){
            System.out.println("Gimmie the next number: ");
            x[i]=read.nextInt();
        }
        System.out.println("The original array: " + x);
        if(biggerToSmaller==0){
        System.out.println("The sorted array: " + Arrays.toString(advancedBubble(x, false)));}
        if(biggerToSmaller==1){
            System.out.println("The sorted array: " + Arrays.toString(advancedBubble(x, true)));
        }
    }

    private static int[] advancedBubble(int[] input, boolean bigToSmall) {
        int temp;
        if (!bigToSmall) {
           for (int i = 1; i < input.length; i++) {
                for (int j = 1; j < input.length; j++) {
                    if (input[j - 1] > input[j]) {
                        temp = input[j];
                        input[j] = input[j - 1];
                        input[j - 1] = temp;

                    }
                }
            }
        }
        else{
            for (int i = 1; i < input.length; i++) {
                for (int j = 1; j < input.length; j++) {
                    if (input[j - 1] < input[j]) {
                        temp = input[j];
                        input[j] = input[j - 1];
                        input[j - 1] = temp;

                    }
                }}
        }
        return input;
    }
}




