package com.learn.user.service.services;

import com.learn.user.service.entiities.User;

import java.util.List;

public interface UserService {
    //user operations
    User saveUser(User user);        // create
    List<User> getAllUser();         // get all users
    User getUser(String userId);     // get single user

    void deleteUser(String userId);  // 🔥 delete user by ID
    User updateUser(String userId, User user);  // 🔥 update user by ID
}
