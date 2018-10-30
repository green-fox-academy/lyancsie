import java.util.*;
import java.lang.String;
public class Anagram {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Gimmie the 1st: ");
        String a = read.next();
        System.out.println("Gimmie the 2nd: ");
        String b = read.next();
        System.out.println(anagram(a, b));
    }

    public static boolean anagram(String str1, String str2) {
        boolean matched[] = new boolean[str1.length()];
        boolean matched2[] = new boolean[str2.length()];
        if (str1.length() != str2.length()) {
            return false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if ((matched[i] == false) && (matched2[j] == false)) {
                        if (str1.charAt(i) == str2.charAt(j)) {
                            matched[i] = true;
                            matched2[j] = true;
                        }
                    }
                }
            }
           for(int i=0;i<str1.length();i++){
           if (matched[i] == false){return false;}
               }
    }return true;}}












