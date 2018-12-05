package xy.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
  
  @RequestMapping("/greeting")
  public Greeting xyz(@RequestParam String x) {
    return new Greeting(1, x);
  }
}
