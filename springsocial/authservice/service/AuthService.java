
package com.springsocial.authservice.service;

import com.springsocial.authservice.database.UserDatabaseMock;
import com.springsocial.authservice.model.UserCredentials;
import com.springsocial.authservice.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserDatabaseMock userDatabase;

    public String authenticateUser(UserCredentials userCredentials) {
        if (userDatabase.validateUser(userCredentials)) {
            return jwtUtil.generateToken(userCredentials.getUsername());
        }
        return null;
    }
}
