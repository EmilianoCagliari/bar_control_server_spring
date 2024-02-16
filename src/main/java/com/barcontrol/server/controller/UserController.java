package com.barcontrol.server.controller;

import com.barcontrol.server.entity.User;
import com.barcontrol.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    private UserService userService;

    @GetMapping()
    public String testuser() {
        return "test user api";
    }

    @GetMapping("/getUsers")
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

}
