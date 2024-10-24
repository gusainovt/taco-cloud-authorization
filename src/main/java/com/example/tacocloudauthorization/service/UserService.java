package com.example.tacocloudauthorization.service;

import com.example.tacocloudauthorization.model.User;

public interface UserService {
    User createUser(User user);

    User getUserByUsername(String username);
}
