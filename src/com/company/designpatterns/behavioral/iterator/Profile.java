package com.company.designpatterns.behavioral.iterator;

import java.util.HashMap;
import java.util.List;

public class Profile {

    private String name;
    private String email;
    private HashMap<String, List<String>> contacts = new HashMap<>();

    public Profile(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
