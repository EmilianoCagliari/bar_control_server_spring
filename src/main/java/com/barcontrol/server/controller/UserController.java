package com.barcontrol.server.controller;

import com.barcontrol.server.entity.User;
import com.barcontrol.server.service.interfaces.IUserService;
import com.barcontrol.server.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/user")
public class UserController {


    @Autowired
    private IUserService userService;
    @GetMapping()
    public String testuser() {
        return "test user api";
    }

    @GetMapping("getUsers")
    public ResponseEntity<?> getAllUsers() {

        Map<String, Object> response = new HashMap<>();

        ResponseEntity<?> re = null;

        try {
            List<User> users = this.userService.getAllUsers();

            re = new ResponseEntity<List<User>>(users, HttpStatus.OK);


        }catch (Exception ex ) {
            re = new ResponseEntity<Map<String, Object>>( response, HttpStatus.BAD_REQUEST);
        }



        return re;
    }

    @GetMapping("getUser")
    public ResponseEntity<?> findUser ( @RequestParam("id") Integer userId ) {

        Map<String, Object> response = new HashMap<>();

        ResponseEntity<?> re = null;

        try {
            User getUser = this.userService.getUser(userId);

            if(getUser == null ) {
                response.put("error", Constants.USER_NOT_FOUND);
                re = new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);

            } else {
                re = new ResponseEntity<User>(getUser, HttpStatus.OK);
            }


        } catch ( Exception ex ) {
            response.put("error", ex.getMessage());
            re = new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return re;
    }

    @PostMapping("create")
    public User createUser() {
        User user = null;

        return this.userService.createUser(user);
    }

}
