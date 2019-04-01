package main;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.*;

public class ReversedLines {
    public static void main(String[] args) {
        Path path = Paths.get("reversed-lines.txt");
        reverseConvert(path);

    }

    public static List<String> reverseConvert(Path path) {
        List<String> content = new ArrayList<String>();
        List<String> output = new ArrayList<String>();
        try {
            content = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < content.size(); i++) {
            for (int j = content.size(); j >= 0; j--) {
                output.add(String.valueOf(content.get(i).charAt(j)));
            }
        }
        return output;
    }
}
