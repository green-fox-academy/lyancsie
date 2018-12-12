package greenfox.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
  
  @GetMapping("/show")
  public String home(Model model) {
    BankAccount simba07 = new BankAccount("Simba", 2000, "Lion");
    model.addAttribute("simba", simba07);
    return "show";
  }
  
  @GetMapping("/randomtext")
  public String random(Model model) {
    model.addAttribute("random", "Random text. Enjoy yourself!");
    return "randomtext";
  }
  
  @GetMapping("/multipleaccounts")
  public String multiple(Model model) {
    List bankAccounts = new ArrayList<>();
    bankAccounts.add(new BankAccount("Geza", 250, "zebra"));
    bankAccounts.add(new BankAccount("Ferenc", 2500, "dog"));
    bankAccounts.add(new BankAccount("Armand", 25000, "kitten"));
    
    model.addAttribute("account", bankAccounts);
    return "multiple";
    
  }
}