package com.example.tacocloudauthorization.service.impl;

import com.example.tacocloudauthorization.model.User;
import com.example.tacocloudauthorization.repository.UserRepository;
import com.example.tacocloudauthorization.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Creates a new user
     * @param user {@link User}
     * @return {@link User}
     */
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }


    /**
     * Find user by username
     * @param username Username
     * @return {@link User}
     */
    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
