package com.example.demo.model;

import javax.persistence.*;

@Entity               // declaration of the table
@Table(name = "cats") // name of the table

public class Cat {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  //u can write ur own strategy
  private Long id;
  @Column(name = "name")
  private String name;
  
  public Cat(String name) {
    this.name = name;
  }
  
  public Cat() {
    name = "xxxx";
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Long getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
}
