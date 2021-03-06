package Extension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  
  int add(int a, int b) {
    return a + b;
  }
  
  int maxOfThree(int a, int b, int c) {
    if (a > b) {
      if (a > c) {
        return a;
      } else return c;
    } else if (c > b) {
      return c;
    } else return b;
  }
  
  int median(List<Integer> pool) {
    Collections.sort(pool);
    return pool.get((pool.size() - 1) / 2);
  }
  
  static boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }
  
  public static String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    ArrayList<Character> changed = new ArrayList<>();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
      }
    }
    return teve;
  }
  
  public static void main(String[] args) {
    System.out.println(translate("kokok"));
  }
}
