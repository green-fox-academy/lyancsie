package com.example.demo.Repositories;

import com.example.demo.Models.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
  
  ApplicationUser findByUsername(String username);
  
  @Override
  List<ApplicationUser> findAll();
}