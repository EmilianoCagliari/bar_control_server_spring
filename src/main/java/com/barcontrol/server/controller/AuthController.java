package com.barcontrol.server.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    @GetMapping()
    public ResponseEntity<String> login() {

        return ResponseEntity.ok("Hello World!");

    }

}
