package com.barcontrol.server.service;

import com.barcontrol.server.entity.User;
import com.barcontrol.server.repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

}
