package main;

import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        Path path = Paths.get("myfile.txt");
        List<String> content = new ArrayList<String>();
        content.add("Csongor Nagy");
        try {
            Files.write(path, content);
            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {
            System.out.println("Error: can't read file");

        }
    }
}

