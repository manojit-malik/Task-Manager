package com.taskmanager.task_user_service.service;

import com.taskmanager.task_user_service.config.JwtProvider;
import com.taskmanager.task_user_service.model.User;
import com.taskmanager.task_user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserProfile(String jwt) {

        String email = JwtProvider.getEmailFromJwtToken(jwt);
        User user = userRepository.findByEmail(email);

        return user;
    }
}
