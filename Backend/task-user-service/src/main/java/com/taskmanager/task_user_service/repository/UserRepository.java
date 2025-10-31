package com.taskmanager.task_user_service.repository;

import com.taskmanager.task_user_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
