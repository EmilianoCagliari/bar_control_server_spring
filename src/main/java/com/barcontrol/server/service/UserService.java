package com.barcontrol.server.service;

import com.barcontrol.server.entity.User;
import com.barcontrol.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService  {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User createUser( User user) {
        return this.userRepository.save(user);
    }
}
