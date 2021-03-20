package com.company.designpatterns.structural.facade2;

public class UserNameFacade {
    public void fix(String name) {
        CapitalizeName capitalizeName = new CapitalizeName();
        String capitalize = capitalizeName.Capitalize(name);
        System.out.println(capitalize);
    }
}
