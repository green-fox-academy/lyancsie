package xy.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //return a view
public class HomeController {
  
  @RequestMapping("/")
  public String home() {
    return "hey"; //hey.html, because we're using @Controller
  }
}