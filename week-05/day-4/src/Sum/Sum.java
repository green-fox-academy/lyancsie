package Sum;

import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

public class Sum {
  
  public static void main(String[] args) {
  
  }
  
  public int sum(ArrayList<Integer> inputList) {
    int mySum = 0;
    
    for (int i = 0; i < inputList.size(); i++) {
      mySum += inputList.get(i);
    }
    return mySum;
  }
}
