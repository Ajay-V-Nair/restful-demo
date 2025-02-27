package com.example.restful.demo.service;

import com.example.restful.demo.model.User;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
    User createUser(User user);
    Optional<User> getUserById(UUID id);
    List<User> getAllUsers();
    User updateUser(UUID id, User user);
    void deleteUser(UUID id);
}
