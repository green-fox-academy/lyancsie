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
        int value=-1;
        int j=1;
        int k;
        for (k = 1; k < input.length() - 1; k++){
            for(j = 1 ; j <q.length() - 1; j++){
            if(input.charAt(k)==q.charAt(j)){
                    System.out.println("Yup"); // to check what's happening here. I know what the mistake is, but just way too knackered to solve it.
                    value=k;
                    break;
                }
            }
            }
            return value;}
                }









