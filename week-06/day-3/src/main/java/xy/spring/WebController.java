package xy.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
  
  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", " ssssh");
    return "greeting";
  }
}
