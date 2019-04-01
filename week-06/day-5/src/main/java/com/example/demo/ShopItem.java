package com.example.demo;

public class ShopItem implements Comparable<ShopItem> {
  
  private String name;
  private String description;
  public double price;
  public int quantity;
  
  public String getName() {
    return name;
  }
  
  public String getDescription() {
    return description;
  }
  
  public double getPrice() {
    return price;
  }
  
  public int getQuantity() {
    return quantity;
  }
  
  public ShopItem(String name, String description, double price, int quantity) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }
  
  @Override
  public int compareTo(ShopItem o) {
    if (this.getPrice() > o.getPrice()) {
      return 1;
    } else {
      return -1;
    }
  }
}