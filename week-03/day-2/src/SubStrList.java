import java.util.Arrays;
import java.util.*;

public class SubStrList {
    public static void main(String[] args) {
        //  Create a function that takes a string and a list of string as a parameter
        //  Returns the index of the string in the list where the first string is part of
        //  Only need to find the first occurence and return the index of that
        //  Returns `-1` if the string is not part any of the strings in the list

        //  Example
        String[] searchArr = new String[]{"this", "is", "what", "I'm", "searching"};
        System.out.println(subStrList("ching", searchArr));
        //  should print: `4`
        System.out.println(subStrList("not", searchArr));
        //  should print: `-1`
    }

    public static int subStrList(String searched, String[] inputArray) {
        int output = 0;
        // for (int i = 0; i <= inputArray.length; i++) {
        // if (Arrays.stream(inputArray).anyMatch(searched::equals)) {
        // ciklusok helyett stream-eket használunk a gyakorlatban, bár ez vmiért nem működik. kérdés, hogy az indexet hogy iratom ki utána
        //  }
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i].contains(searched)){output=i;} else{output = -1;}
        }
        return output;
    }
}