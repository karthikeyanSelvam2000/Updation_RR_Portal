package com.example.Updation_RR_Portal.Service;


import org.springframework.security.core.userdetails.UserDetails;

public interface LoginService {
    UserDetails loadUserByUsername(String username);
    String getRole();
    Void UpdateToken(String token);



}
