import java.io.IOException;
import java.util.*;
import java.nio.file.*;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
        Scanner read = new Scanner(System.in);
        System.out.println("Gimmmie the file name: ");
        String source = read.next();
        System.out.println(counter(source));
    }

    public static int counter(String input) {
        Path path = Paths.get(input);

        try {
            List<String> content = Files.readAllLines(path);
            return content.size();
        } catch (IOException e) {
            return 0;
        }
    }
}
