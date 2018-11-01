import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Gimmie a text: ");
        Scanner read = new Scanner(System.in);
        System.out.println(palindrome(read.next()));
    }

    public static String palindrome(String input) {
        String inputBack = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            inputBack = inputBack + input.charAt(i);
        }
        return (input + inputBack);
    }
}
