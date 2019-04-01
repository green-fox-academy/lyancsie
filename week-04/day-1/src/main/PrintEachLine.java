package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"
        Path source = Paths.get("myfile.txt"); //doesn't read from the src, but the project folder (day-1 in this case)
        try {
            List<String> content = Files.readAllLines(source);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Error: can't read file");
        }
    }
}
