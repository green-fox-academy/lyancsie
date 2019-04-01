package greenfox.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
  
  List bankAccounts = new ArrayList<>();
  
  @GetMapping("/show")
  public String home(Model model) {
    BankAccount simba07 = new BankAccount("Simba", 2000, "Lion", false);
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
    if (bankAccounts.isEmpty()) {
      bankAccounts.add(new BankAccount("Geza", 250, "zebra", false));
      bankAccounts.add(new BankAccount("Ferenc", 2500, "dog", false));
      bankAccounts.add(new BankAccount("Armand", 25000, "kitten", true));
    }
    model.addAttribute("account", bankAccounts);
    model.addAttribute("which", new MyStringClass());
    return "multiple";
  }
  
  @PostMapping(path = "/multipleaccounts")
  public String multipleInc(Model model, @ModelAttribute("which") MyStringClass x) {
    //bankAccounts.stream().filter(i -> i.getName.equals)
    model.addAttribute(x);
    System.out.println("blabla" + x.getMyString());
    return "redirect:/multipleaccounts";
    
  }
}