import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.*;
public class ReversedOrder {
    public static void main(String[] args) {
        Path path = Paths.get("reversed-order.txt");

    }
    public static List<String> reversedOrder(Path path){
        List<String> content = new ArrayList<String>();
        List <String> output = new ArrayList<String>();
        try {
            Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = content.size(); i >= 0; i++) {
            output.add(content.get(i));
        }
    return output;}
}
