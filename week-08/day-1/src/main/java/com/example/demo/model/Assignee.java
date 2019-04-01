package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "assignees")
public class Assignee {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  private String name;
  private String mail;
  
  @OneToMany(
      mappedBy = "assignee",
      cascade = CascadeType.ALL,
      orphanRemoval = true
  )
  private List<Todo> todoList;
 /* @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id")
  private Todo todo;*/
  
  public Assignee() {
  }
  
  public Assignee(String name, String mail) {
    this.name = name;
    this.mail = mail;
  }
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getMail() {
    return mail;
  }
  
  public void setMail(String mail) {
    this.mail = mail;
  }
  
}
