package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  
  ShopItemList shopItemList = ShopItemList.getInstance();
  
  @GetMapping("/")
  public String home(Model model) {
    model.addAttribute("shopItems", shopItemList.getShopItemList());
    return "webshop"; //webshop.html, because we're using @Controller
  }
  
  @GetMapping("/available")
  public String available(Model model) {
    model.addAttribute("shopItems", shopItemList.onlyAvailable());
    return "webshop";
  }
  
  @GetMapping("/cheapest")
  public String cheapest(Model model) {
    //model.addAttribute("shopItems", shopItemList.cheapestFirst());
    return "webshop";
  }
  
  @GetMapping("/mostexpensive")
  public String mostExpensive(Model model) {
    model.addAttribute("average", shopItemList.mostExpensive().findFirst().get().getName());
    return "webshop";
  }
  
  @GetMapping("/contains")
  public String contains(Model model) {
    model.addAttribute("shopItems", shopItemList.contains());
    return "webshop";
  }
  
  @GetMapping("/avg")
  public String avg(Model model) {
    model.addAttribute("average", shopItemList.avg().getAsDouble());
    return "webshop";
  }
}
