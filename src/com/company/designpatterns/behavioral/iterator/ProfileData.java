package com.company.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProfileData {

    private static List<Profile> dummyProfiles = new ArrayList<>();

    public static List<String> getProfiles() {
        List<String> profileEmails = new ArrayList<>();

        dummyProfiles.add(new Profile("dummy1", "dummy1@gmail.com"));
        dummyProfiles.add(new Profile("dummy2", "dummy2@gmail.com"));
        dummyProfiles.add(new Profile("dummy3", "dummy3@gmail.com"));

        for (Profile profile : dummyProfiles) {
            profileEmails.add(profile.getEmail());
        }

        return profileEmails;
    }

    public static Profile getProfile(String email) {
        for (Profile profile : dummyProfiles) {
            if (email.equals(profile.getEmail())) {
                return profile;
            }
        }
        Profile profile = new Profile("new User", email);
        return profile;
    }

    public static void main(String[] args) {
        ProfileIterator iterator = new ProfileIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.getNext().getEmail());
        }
    }
}
