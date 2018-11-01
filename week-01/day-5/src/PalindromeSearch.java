public class PalindromeSearch {
    public static void main(String[] args) {
        String test = "dog goat dad duck doodle never";
        palindromeSearch(test);
    }

    public static String[] palindromeSearch(String input) {
        String reverseInput = new String();
        for (int i = 1; i <= input.length(); i++) {
            //      reverseInput.charAt(i) = input.charAt(input.length() - i); Why not good?
            reverseInput = reverseInput + input.charAt(input.length() - i); //tested, works
        }

        System.out.println(reverseInput);
        String output[] = new String[input.length()];
        for (int n = 3; n < input.length(); n++) { // changes the length the inside for is looking for

            for (int i = 0; i < input.length() - n; i++) {
                if (input.substring(i, i + n).equals(reverseInput.substring(reverseInput.length() - n - i, reverseInput.length() - i))) { //Never use "==" in the case of Strings! It is going to be memory reference
                    output[i] = input.substring(i, i + n);
                }
            }
        }
        for (
                int k = 0;
                k < output.length - 1; k++) {
            if (output[k] != null) {
                System.out.println(output[k]);
            }
        }
        return output;
    }
}



