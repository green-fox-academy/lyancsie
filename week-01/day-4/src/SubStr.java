public class SubStr {

    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:
        System.out.println(subStr("this is what I'm searching in", "searching"));
        //  should print: `17`
        System.out.println(subStr("this is what I'm searching in", "not"));
        //  should print: `-1`
    }

    public static int subStr(String input, String q) {
        int counter = 0;
        int value = 0;
        for (int j = 0; j < input.length(); j++) {
            if (counter == q.length()) {
                return j;
            }
            if (input.charAt(j) == q.charAt(0)) {
                counter++;
                if (counter == q.length()) {
                    return j;
                }
                value = j;
                for (int k = 1; k < q.length(); k++) {
                    if (input.length() <= j + k) {
                        if (input.length() == q.charAt(k)) {
                            counter++;
                            if (counter == q.length()) {
                                return value;
                            }
                        } else {
                            counter = 0;
                            break;
                        }
                    }
                    if (input.charAt(j + k) == q.charAt(k)) {
                        counter++;
                        if (counter == q.length()) {
                            return value;
                        }
                    } else {
                        counter = 0;
                        break;
                    }
                }
            }
        }


        if (counter == q.length()) {
            return value;
        } else {
            return -1;
        }
    }
}









