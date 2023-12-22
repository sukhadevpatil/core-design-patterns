package com.core.design.pattern.behavioural.iterator;

public class Test {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("100", "Sukhdev"));
        userManagement.addUser(new User("101", "Amit"));
        userManagement.addUser(new User("102", "Kiran"));
        userManagement.addUser(new User("103", "Shourya"));
        userManagement.addUser(new User("104", "Supriya"));

        MyIterator iterator = userManagement.iterator();

        while (iterator.hasNext()) {
            User user =(User) iterator.next();

            System.out.println(user);
        }
    }
}
