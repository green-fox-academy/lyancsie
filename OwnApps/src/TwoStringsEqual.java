public class TwoStringsEqual {
    public static void main(String[] args) {
        System.out.println(twoStringsEqual("string1", "string1")); //returns true

        String text1 = "abc";
        String text2 = "abc";
        System.out.println(twoStringsEqual(text1, text2)); //returns true

        System.out.println(twoStringsEqual(text1.substring(0, 2), text2.substring(0, 2))); // Returns false - ONLY WORKS WITH .equals!!!

        float a = 50;
        int b = 50;
        System.out.println(a == b); //returns true

        double c = 50;
        Integer d = 50;
        System.out.println(c == d); //returns true
    }


    public static boolean twoStringsEqual(String text1, String text2) {
        if (text1 == text2) {
            return true;
        } else {
            return false;
        }
    }


}