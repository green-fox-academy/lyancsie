import java.util.*;

public class Third {
    public static void main(String[] args) {
        // - Create an array variable named `q`
//   with the following content: `[4, 5, 6, 7]`
// - Print the third element of `q`
        int[] myArray = new int[4];
        int init = 4;
        for (int i = 0; i < 4; i++) {
            myArray[i] = init;
            init = init + 1;
        }
        System.out.println(myArray[2]);
    }
}
