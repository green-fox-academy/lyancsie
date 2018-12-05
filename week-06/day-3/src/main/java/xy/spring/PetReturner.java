package xy.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetReturner {
  
  @RequestMapping("/pet")
  public Pet pet() {
    return new Pet("xyz", 26);
    
  }
}
