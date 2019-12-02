package com.example.application.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    //==
    //@Autowired
    //UserRepository = userRepository


    public UserRepository getUserRepository() {
        return userRepository;
    }
}
