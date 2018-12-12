package greenfox.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  
  @GetMapping("/index")
  public String home(Model model) {
    BankAccount simba07 = new BankAccount("Simba", 2000, "Lion");
    model.addAttribute("model", simba07);
    
  }
}
