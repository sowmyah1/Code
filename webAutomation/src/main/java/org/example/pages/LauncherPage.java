package org.example.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class LauncherPage extends BasePage {
        public LauncherPage(WebDriver webDriver) {
            super(webDriver);
        }

        public boolean navigateTo(String url) {
            webDriver.get(url);
            return isSiteLoaded();
        }

        public boolean isSiteLoaded() {
            return new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(webDriver ->
                    ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        }



    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

// For Firefox
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1 = new FirefoxDriver();
    }


}

