package com.barcontrol.server.service;

import com.barcontrol.server.entity.User;
import com.barcontrol.server.repository.UserRepository;
import com.barcontrol.server.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUser(Integer id) {

        User userResponse = null;

        Optional<User> dbUser = this.userRepository.findById( id );

        if( dbUser.isPresent() ) {
            userResponse = dbUser.get();
        }

        return userResponse;
    }

    @Override
    public User createUser( User user) {
        return this.userRepository.save(user);
    }
}
