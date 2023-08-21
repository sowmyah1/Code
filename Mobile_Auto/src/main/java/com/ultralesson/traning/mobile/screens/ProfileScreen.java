package com.ultralesson.traning.mobile.screens;

import com.ultralesson.traning.mobile.models.User;
import io.appium.java_client.AppiumDriver;

public class ProfileScreen {

    private AppiumDriver appiumDriver;

    public ProfileScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public User getProfileDetails() {
        return new User();
    }
}