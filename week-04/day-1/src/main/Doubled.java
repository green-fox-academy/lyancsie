package main;

import java.io.IOException;
import java.util.*;
import java.nio.file.*;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        Path path = Paths.get("duplicated-chars.txt");
        List<String> text = new ArrayList<String>();
        try {
            text = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String row = "";
        for (int i = 0; i < text.size(); i++) {
            row = text.get(i);
            for (int j = 0; j < row.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(row.charAt(j));
                }
            }
        }
    }
}

