package org.ultralesson.traning.mobile;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Lancher {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {


//        public AndroidDriver<MobileElement> launcher () throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "Pixel 6");
            caps.setCapability("udid", "emulator-5554"); // You can get it from 'adb devices' command
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("app", "/Users/testvgrant/Downloads/ul-coach.apk"); // Replace with your app's path
            caps.setCapability("appPackage", "com.ultralesson.coach");
            caps.setCapability("appActivity", "com.ultralesson.coach.MainActivity");
            AndroidDriver<MobileElement> driver = null;
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            Thread.sleep(2000);

//            return driver;

        }

}