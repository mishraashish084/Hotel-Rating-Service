package com.learn.user.service.services;

import com.learn.user.service.entiities.User;

import java.util.List;

public interface UserService {
    //user operation
    //create
    //update
    User saveUser(User user);
    //get all user
    List<User> getAllUser();
    //get single user of given id
    User getUser(String userId);

    //TODO:delete
    //TODO:update
}