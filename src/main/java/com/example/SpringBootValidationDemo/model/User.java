package com.example.SpringBootValidationDemo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.stereotype.Controller;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name",nullable = false)
    @NotEmpty(message = "name message")
    @Size(min = 2,message = "user name should have at least 2 characters")
    private String name;
    @NotEmpty(message = "Email message")
    @Email
    private String email;

    @NotEmpty(message = "password massage")
    @Size(min = 8,max = 20,message = "password could have between 8 and 20 characters")
    private String password;

    public User() {
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
