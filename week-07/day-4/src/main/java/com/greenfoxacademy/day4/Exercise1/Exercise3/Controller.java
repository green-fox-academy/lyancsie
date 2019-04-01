package com.greenfoxacademy.day4.Exercise1.Exercise3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping("/useful")
public class Controller {
  
  @Autowired
  UtilityService utilityService = new UtilityService();
  
  @GetMapping("/coloured")
  public String coloured(Model model) {
    model.addAttribute("randomcolor", utilityService.randomColor());
    model.addAttribute("codedtext", utilityService.caesar("iamjesus", 1));
    model.addAttribute("decodedtext", utilityService.caesar("jbnkftvt", -1));
    return "coloured";
  }
  
  @GetMapping("/email")
  public String email(Model model, @RequestParam String a) {
    model.addAttribute("valid", utilityService.validateMail(a));
    return "email";
  }
  
  @PostMapping("/email")
  public String email2(Model model, @ModelAttribute("nameinthehtml") String b) {
    model.addAttribute("valid2", utilityService.validateMail(b));
    System.out.println(b);
    return "email";
  }
}