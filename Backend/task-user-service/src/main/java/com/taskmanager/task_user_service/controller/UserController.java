package com.taskmanager.task_user_service.controller;

import com.taskmanager.task_user_service.model.User;
import com.taskmanager.task_user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public ResponseEntity<User> getUserProfile(@RequestHeader ("Authorization") String jwt ) {

        User user = userService.getUserProfile(jwt);
        return new ResponseEntity<>(user, HttpStatus.OK);

    }

}
