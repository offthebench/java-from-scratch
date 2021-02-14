package com.company.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProfileIterator implements Iterator {

    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = ProfileData.getProfiles();

            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String tempEmail = emails.get(currentPosition);
        Profile tempProfile = profiles.get(currentPosition);
        if (tempProfile == null) {
            tempProfile = ProfileData.getProfile(tempEmail);
            profiles.add(tempProfile);
        }
        System.out.println(currentPosition);
        currentPosition++;
        return tempProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
