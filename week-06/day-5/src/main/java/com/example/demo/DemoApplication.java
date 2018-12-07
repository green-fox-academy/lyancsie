package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
  
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    ShopItemList shopItemList = ShopItemList.getInstance();
    shopItemList.add(new ShopItem("G80 shoes", "Quality shoes", 200, 26));
    shopItemList.add(new ShopItem("Golden jewellery", "Expensive jewellery", 3000, 0));
    shopItemList.add(new ShopItem("Example boots", "Decent boots", 250, 42));
    
  }
}
