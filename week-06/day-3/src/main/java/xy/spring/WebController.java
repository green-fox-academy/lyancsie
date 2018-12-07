package xy.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
  
  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam String name) {
    Greeting greeting = new Greeting(name);
    model.addAttribute("name", name);
    model.addAttribute("id", greeting.getLongId());
    return "greeting";
  }
}