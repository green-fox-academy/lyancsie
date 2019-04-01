package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RedditPost {
  
  @Id
  @GeneratedValue
  private Long id;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public Integer getLikes() {
    return likes;
  }
  
  public void setLikes(Integer likes) {
    this.likes = likes;
  }
  
  public String getText() {
    return text;
  }
  
  public void setText(String text) {
    this.text = text;
  }
  
  @Column(name = "likes")
  private Integer likes;
  @Column
  private String text;
  
  public RedditPost(Integer likes, String text) {
    this.likes = likes;
    this.text = text;
  }
  
  public RedditPost() {
  }
}
