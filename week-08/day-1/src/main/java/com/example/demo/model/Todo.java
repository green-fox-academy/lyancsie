package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column(name = "title")
  private String title;
  @Column(name = "urgent")
  private boolean urgent;
  
  public Todo(String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public boolean getUrgent() {
    return urgent;
  }
  
  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }
  
  public boolean getDone() {
    return done;
  }
  
  public void setDone(boolean done) {
    this.done = done;
  }
  
  @Column(name = "done")
  private boolean done;
  
  public Todo() {
    urgent = false;
    done = false;
  }
  
  public Todo(Long id, String title) {
    this.id = id;
    this.title = title;
    urgent = false;
    done = false;
  }
  
  public Todo(String title) {
    this.title = title;
    urgent = false;
    done = false;
  }
  
}
