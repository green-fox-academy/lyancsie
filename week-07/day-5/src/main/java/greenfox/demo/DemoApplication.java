package greenfox.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
  
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
  
  @Override
  public void run(String... args) throws Exception {
    List<Fox> foxList = new ArrayList<>();
    
    foxList.add(new Fox("Abdul", new ArrayList<>(Arrays.asList((new Trick("xyz")), new Trick("have fun"))), "banana", "juice"));
    foxList.add(new Fox("Koko", new ArrayList<>(Arrays.asList(new Trick("climb"))), "banana", "juice"));
    foxList.add(new Fox("Black", new ArrayList<>(Arrays.asList(new Trick("fly"))), "banana", "juice"));
    
    for (int i = 0; i < foxList.size(); i++) {
      System.out.println(foxList.get(i).name);
    }
  }
}

