package com.core.design.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("test_user")
                .setUserEmail("test@gmail.com")
                .setUserName("sukhadev")
                .build();

        System.out.println(user);

        User user2 = new User.UserBuilder()
                .setUserId("test_user2")
                .setUserEmail("test2@gmail.com")
                .setUserName("sukhadev2")
                .build();

        System.out.println(user2);
    }
}
