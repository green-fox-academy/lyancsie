package com.example.demo.Controllers;

import com.example.demo.RedditPost;
import com.example.demo.Repositories.RedditPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RedditPostController {
  
  private RedditPostRepository postRepository;
  
  @Autowired
  public RedditPostController(RedditPostRepository postRepository) {
    this.postRepository = postRepository;
  }
  
  @GetMapping({"", "/"})
  public String posts(Model model) {
    model.addAttribute("posts", postRepository.findAll());
    return "posts";
  }
  
  @GetMapping("/submit")
  public String submit() {
    return "submit";
  }
  
  @GetMapping("/{id}/increase")
  public String increase(@PathVariable Long id) {
    postRepository.findById(id).get().setLikes(postRepository.findById(id).get().getLikes() + 1);
    postRepository.save(postRepository.findById(id).get());
    return "redirect:/";
  }
  
  @GetMapping("/{id}/decrease")
  public String decrease(@PathVariable Long id) {
    postRepository.findById(id).get().setLikes(postRepository.findById(id).get().getLikes() - 1);
    postRepository.save(postRepository.findById(id).get());
    return "redirect:/";
  }
  
  @PostMapping({"", "/"})
  public String submit(Model model, RedditPost newPost) {
    postRepository.save(newPost);
    return "redirect:/";
  }
}
