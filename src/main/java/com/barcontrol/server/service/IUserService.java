package com.barcontrol.server.service;

import com.barcontrol.server.entity.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();

    User createUser( User user );
}
