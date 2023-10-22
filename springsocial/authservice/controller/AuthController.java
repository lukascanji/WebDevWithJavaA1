
package com.springsocial.authservice.controller;

import com.springsocial.authservice.model.UserCredentials;
import com.springsocial.authservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String loginUser(@RequestBody UserCredentials userCredentials) {
        return authService.authenticateUser(userCredentials);
    }
}
