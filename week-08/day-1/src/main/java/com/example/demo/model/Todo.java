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
  @Column(name = "done")
  private boolean done;
  @Column(name = "description") //u can set many things here --> whether it's unique, nullable, ...
  private String description;

  public Todo(String title, boolean urgent, boolean done, String description) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
    this.description = description;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ASSIGNEE_ID", nullable = true) //name of the foreign key
  private Assignee assignee;
/*  @OneToMany(
      mappedBy = "todos",
      cascade = CascadeType.ALL,
      orphanRemoval = true
  )
  private List<Todo> todoList = new ArrayList<>();*/

  public Todo() {
    urgent = false;
    done = false;
    description = "not available";
  }

  public Todo(Long id, String title) {
    this.id = id;
    this.title = title;
    urgent = false;
    done = false;
    description = "not available";

  }

  public Todo(String title) {
    this.title = title;
    urgent = false;
    done = false;
    description = "not available";
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }
}