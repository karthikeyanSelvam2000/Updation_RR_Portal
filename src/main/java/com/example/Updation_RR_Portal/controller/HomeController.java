package com.example.Updation_RR_Portal.controller;

import com.example.Updation_RR_Portal.Service.LoginService;
import com.example.Updation_RR_Portal.request.JwtRequest;
import com.example.Updation_RR_Portal.response.JwtResponse;
import com.example.Updation_RR_Portal.utility.JwtUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private JwtUtility jwtUtility;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private LoginService loginService;

    @GetMapping("/get")
    public String home() {
        return "Welcome to Daily Code Buffer!!";
    }

    @PostMapping("/authenticate")
    public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception{

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getUsername(),
                            jwtRequest.getPassword()
                    )
            );
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
        final UserDetails userDetails
                = loginService.loadUserByUsername(jwtRequest.getUsername());
        String body="You are Login into the Application Successfully!!!Please Find your Role and Token above to move forward into the application!!!Thank you!!!";
        String token =
                jwtUtility.generateToken(userDetails);

        Void UpdateJWTtoken=loginService.UpdateToken(token);


        final String role= loginService.getRole();

        return  new JwtResponse(body,token,role);
    }
}
