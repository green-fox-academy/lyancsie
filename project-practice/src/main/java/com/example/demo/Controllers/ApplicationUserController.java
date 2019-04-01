package com.example.demo.Controllers;

import com.example.demo.Models.ApplicationUser;
import com.example.demo.Services.ApplicationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class ApplicationUserController {
  
  private ApplicationUserService applicationUserService;
  private BCryptPasswordEncoder bCryptPasswordEncoder;
  
  @Autowired
  public ApplicationUserController(ApplicationUserService applicationUserService, BCryptPasswordEncoder bCryptPasswordEncoder) {
    this.applicationUserService = applicationUserService;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }
  
  @GetMapping("/")
  public ResponseEntity showUsers() {
    return ResponseEntity.ok().body(applicationUserService.findAll());
  }
  
  @PostMapping("/sign-up")
  public ResponseEntity register(@RequestBody ApplicationUser applicationUserDTO) {
    ApplicationUser applicationUser;
    applicationUser = ApplicationUser
        .builder()
        .setSomeUsername(applicationUserDTO.getUsername())
        .setSomePassword(bCryptPasswordEncoder.encode(applicationUserDTO.getPassword()))
        .build();
    applicationUserService.save(applicationUser);
    return ResponseEntity.ok("Registration done");
  }
}