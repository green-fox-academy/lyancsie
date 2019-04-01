package com.example.demo.Repositories;

import com.example.demo.RedditPost;
import org.springframework.data.repository.CrudRepository;

public interface RedditPostRepository extends CrudRepository<RedditPost, Long> {
  
}
