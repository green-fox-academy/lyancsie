package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ShopItemList {
  
  private static List<ShopItem> shopItemList = new ArrayList<ShopItem>();
  private static ShopItemList instance;
  
  private ShopItemList() {
    shopItemList = new ArrayList<>();
  }
  
  public static ShopItemList getInstance() {
    if (instance == null) {
      instance = new ShopItemList();
    }
    return instance;
  }
  
  public void add(ShopItem item) {
    if (item != null) {
      shopItemList.add(item);
    }
  }
}