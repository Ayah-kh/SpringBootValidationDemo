package com.example.SpringBootValidationDemo.service;

import com.example.SpringBootValidationDemo.exeption.ResourceNotFoundException;
import com.example.SpringBootValidationDemo.model.User;
import com.example.SpringBootValidationDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getUserById(long id){
        User user = userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User","id",id));
        return user;
    }

}
