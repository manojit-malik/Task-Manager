package com.taskmanager.task_user_service.service;

import com.taskmanager.task_user_service.model.User;

public interface UserService {

    User getUserProfile(String jwt);

}
