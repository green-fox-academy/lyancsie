package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {
  
  @Getter
  @Setter
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Getter
  @Setter
  @Column(name = "title")
  private String title;
  @Getter
  @Setter
  @Column(name = "urgent")
  private boolean urgent;
  
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
  
  public boolean isUrgent() {
    return urgent;
  }
  
  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }
  
  public boolean isDone() {
    return done;
  }
  
  public void setDone(boolean done) {
    this.done = done;
  }
  
  @Getter
  @Setter
  @Column(name = "done")
  private boolean done;
  
  public Todo() {
  
  }
  
  public Todo(Long id, String title) {
    this.id = id;
    this.title = title;
    urgent = false;
    done = false;
  }
  
  public Todo(String title) {
    this.title = title;
  }
}
