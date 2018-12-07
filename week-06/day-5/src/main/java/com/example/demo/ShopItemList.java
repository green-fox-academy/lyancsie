package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShopItemList {
  
  private List<ShopItem> shopItemList;
  private static ShopItemList instance;
  
  public List<ShopItem> getShopItemList() {
    return shopItemList;
  }
  
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
  
  public List<ShopItem> onlyAvailable() {
    return shopItemList.stream()
        .filter(shopItem -> shopItem.quantity != 0)
        .collect(Collectors.toList());
  }
  
  public List<ShopItem> cheapestFirst() {
    /*return shopItemList.stream()
        .sorted(Comparator.reverseOrder(shopItemList));*/
    return shopItemList;
  }
  
  public List<ShopItem> contains() {
    //shopItemList.stream().
    return shopItemList;
  }
  
  public OptionalDouble avg() {
    return shopItemList.stream().mapToDouble(i -> (i.quantity)).average();
  }
  
  public Stream<ShopItem> mostExpensive() {
    OptionalDouble g = shopItemList.stream().mapToDouble(i -> (i.price)).max();
    return shopItemList.stream().filter(i -> i.price == g.getAsDouble());
  }
}