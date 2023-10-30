package com.example.SpringBootValidationDemo.model;

public class UserClass {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Ahamd");
        user.setId(1);
        user.setEmail("Ahamad@gmail");
        user.setPassword("5555555");
        User user2 = new User();
        user2.setName("Ahamd");
        user2.setId(1);
        user2.setEmail("Ahamad@gmail");
        user2.setPassword("5555555");

        System.out.println("user = " + user);


    }
}
