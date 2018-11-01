public class PalindromeSearch {
    public static void main(String[] args) {
        String test = "Go ogre reinitialize your rude goon";
        String[] result = palindromeSearch(test);
        System.out.println(test);
        for (int k = 0; k < result.length ; k++) { // minden típusnak megvannak a saját konsansai, metódusai, stb
            if (result[k] != null) {
                System.out.println(k + ": " + result[k]);
            }
        }
    }

    public static String[] palindromeSearch(String input) {
        String reverseInput = "";
        for (int i = 1; i <= input.length(); i++) {
            //      reverseInput.charAt(i) = input.charAt(input.length() - i); Why not good?. A method can NOT be placed to the left side. the .charAt method gives back the value of something
            reverseInput = reverseInput + input.charAt(input.length() - i); //tested, works
        }
        System.out.println(reverseInput);
        String output[] = new String[input.length()];
        for (int n = 3; n <= input.length(); n++) { // changes the length the inside for is looking for
            for (int i = 0; i <= input.length() - n; i++) {
                if (input.substring(i, i + n).equals(reverseInput.substring(reverseInput.length() - n - i, reverseInput.length() - i))) { //Never use "==" in the case of Strings! It is going to be memory reference
                    output[i] = input.substring(i, i + n);
                }
            }
        }
        return output;
    }
}



