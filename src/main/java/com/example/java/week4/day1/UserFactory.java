package com.example.java.week4.day1;

public class UserFactory {
    public User getAdultUser() {
        User user = new User(null, null, 0);
        user.setAge(34);
        return user;
    }
}
