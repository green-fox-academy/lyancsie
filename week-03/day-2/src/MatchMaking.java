import java.util.*;
public class MatchMaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Sandor"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        //return(input1.addAll(input2)); --> the expression in the brackets is a boolean! it won't work this way
        ArrayList<String> girlsboys = new ArrayList<>();
        for(int i=0; i<girls.size(); i++){
            girlsboys.add(girls.get(i));
            girlsboys.add(boys.get(i));
        }

        return girlsboys;
    }
}

