package josephus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Josephus {
  
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Give me the number of soldiers: ");
    int x = read.nextInt();
    System.out.println(josephus(x));
  }
  
  boolean isAlive = true;
  boolean isNext = true;
  static int numberOfDeaths = 0;
  
  boolean isWinner = false;
  
  public static int josephus(int x) {
    int result = 0;
    List<Josephus> josephusList = new ArrayList<>();
    for (int i = 0; i < x; i++) {
      Josephus temp = new Josephus();
      josephusList.add(temp);
    }
    while (numberOfDeaths < x - 1) {
      int count = 0;
      for (int i = 0; i < josephusList.size(); i++) {
        if (josephusList.get(i).isAlive) {
          count = 1;
        }
        if (i != josephusList.size() - 1) {
          if (count == 1 && josephusList.get(i + 1).isAlive) { //the problem is here
            josephusList.get(i + 1).isAlive = false;
            count = 0;
            numberOfDeaths += 1;
            System.out.println(i + 2);

//            System.out.println(i + 2 + "has been killed");
          }
        }
      }
      System.out.println("Number of deaths: " + numberOfDeaths);
    }
    for (int i = 0; i < josephusList.size(); i++) {
      // System.out.println(josephusList.get(i).isAlive);
      //if (josephusList.get(i).isAlive) {
      //  result = i+1;
      //  break;
      // }
    }
    return result;
  }
}



