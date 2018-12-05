package xy.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class XController {
  
  @RequestMapping("/x")
  public String x(@RequestParam String x) {
    System.out.println(x);
    return "Hey all"; //it will return the actual string value in the quotation marks
    //you can do the same with @Controller and @ResponseBody
  }
}