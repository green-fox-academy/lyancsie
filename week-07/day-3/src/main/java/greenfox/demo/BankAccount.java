package greenfox.demo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BankAccount {
  
  private String name;
  private double balance;
  private String animalType;
  
  public String getName() {
    return name;
  }
  
  public String getBalance() {
    //return balance;
    NumberFormat formatter = new DecimalFormat("#0.00");
    return formatter.format(balance);
  }
  
  public String getAnimalType() {
    return animalType;
  }
  
  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }
}
