import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[]{1, 11, 356215, 318, 11111, 61, 101}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[]{1, 191, 34, 52, 619}));
        //  should print: '[]'
    }

    public static ArrayList<String> subInt(int id, int[] list) { //not working. the theory itself is mistaken.
        String[] list2 = new String[list.length];
        ArrayList<String> output = new ArrayList<String>();
        for (int i = 0; i < list2.length; i++) { // copies and converts the integer array to String
            list2[i] = String.valueOf(list[i]);
            //System.out.println(list2[i]);
        }
        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j <= Math.log10(list[i]+1); j++) {
                if ((String.valueOf(list2[i].charAt(j))).equals(String.valueOf(id))) {
                    output.add(list2[i]);
                    break;
                }
            }
        }
        return output;
        /*     int digits[] = new int[list.length];
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            digits[i] = (int) (Math.log10(list[i]))+1;
            System.out.println(digits[i]);}

            for (int j = 0; j < list.length; j++) {
               for (int k = 0; k < digits[j]; k++) {
                    if(list[k] == id){output.add(j);} */

    }
}




