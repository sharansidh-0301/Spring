package com.todoapi.todoapi.service;


import com.todoapi.todoapi.models.User;
import com.todoapi.todoapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getUsers(long id){
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("User Not Found"));
    }


}
