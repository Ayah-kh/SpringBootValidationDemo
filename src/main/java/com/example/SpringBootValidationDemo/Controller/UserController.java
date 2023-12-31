package com.example.SpringBootValidationDemo.Controller;

import com.example.SpringBootValidationDemo.model.User;
import com.example.SpringBootValidationDemo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User user1 = userService.createUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }
 @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id){
       return new ResponseEntity<>(userService.getUserById(id),HttpStatus.OK);
    }
}
