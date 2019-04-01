package com.example.demo.Services;

import com.example.demo.Models.ApplicationUser;
import com.example.demo.Repositories.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationUserService {
  
  public ApplicationUserService() {
  }
  
  private ApplicationUserRepository applicationUserRepository;
  
  @Autowired
  public ApplicationUserService(ApplicationUserRepository applicationUserRepository) {
    this.applicationUserRepository = applicationUserRepository;
  }
  
  public void save(ApplicationUser user) {
    applicationUserRepository.save(user);
  }
  
  public List<ApplicationUser> findAll() {
    return applicationUserRepository.findAll();
  }
}