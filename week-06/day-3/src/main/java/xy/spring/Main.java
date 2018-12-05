package xy.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xy.spring.Greeting.Greeting;

@Controller
public class Main {
  
  @RequestMapping("/greetme")
  public Greeting xyz() {
    return new Greeting(1, "Hello world");
    
  }
}
