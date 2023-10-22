
package com.springsocial.authservice.database;

import com.springsocial.authservice.model.UserCredentials;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserDatabaseMock {
    
    private Map<String, String> users = new HashMap<>();

    public UserDatabaseMock() {
        // Sample users for demonstration
        users.put("alice", "password123");
        users.put("bob", "password456");
    }

    public boolean validateUser(UserCredentials userCredentials) {
        String password = users.get(userCredentials.getUsername());
        return password != null && password.equals(userCredentials.getPassword());
    }
}
