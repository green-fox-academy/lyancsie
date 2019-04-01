package greenfox.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  
  @GetMapping("/index")
  public String mainGet(@RequestParam String str, Model model) {
    model.addAttribute("name", str);
    return "index";
  }
  
  @PostMapping("/index")
  public String mainPost(Model model) {
    
    return "index";
  }
  
  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }
  
  @PostMapping("/login")
  public String postLogin(@RequestParam String name) {
    return "redirect:/index?str=" + name;
  }
  
 /* @GetMapping("/info")
  public String info() {

  }*/
}