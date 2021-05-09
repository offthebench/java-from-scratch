package com.company.advanced.encapsulation;

public class User {

    // Public Fields
    private String userName;
    private String password;

    // Parameterized Constructor to create new users
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password) {
        //Check if the username and password match
        if (this.userName.toLowerCase().equals(userName.toLowerCase())
                && this.password.equals(password)) {
            // .toLowrcase converts all the characters to lowercase
            // & .equals checks if two strings match

            System.out.println("Access Granted against the username: "
                    +this.userName +" and password: "+this.password);
        }
        else System.out.println("Invalid Credentials!"); //Else invalid credentials
    }

}

class Main {

    public static void main(String[] args) {
        User educative = new User("Educative","12345"); //Creates a new user and stores the password and username

        educative.login("Educative","12345"); //Grants access because credentials are valid

        educative.login("Educative", "3456"); //Does not grant access because the credentials are invalid

        educative.login("Educative", "3456"); // GRANTS ACCESS BUT THIS SHOULD NOT HAVE HAPPENED!
    }
}
