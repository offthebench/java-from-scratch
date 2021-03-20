package com.company.designpatterns.structural.facade2;

public class Client {

    public static void main(String[] args) {
        User user = new User("Akshay");
        UserNameFacade facade = new UserNameFacade();
        facade.fix(user.getName());
    }
}
