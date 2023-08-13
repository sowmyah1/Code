package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckBoxIframeDemo {
    public static void main(String[] args) throws InterruptedException {
        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://htmldog.com/examples/inputcheckboxes/");

        // Explicit Wait setup
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        // Locate the iFrame on the page
        WebElement iframe = driver.findElement(By.id("body > iframe"));
        // Explicitly wait for the iFrame to be visible
        wait.until(ExpectedConditions.visibilityOf(iframe));

        // Switch to the iFrame
        driver.switchTo().frame(iframe);

        // Locate the checkboxes and store in a list
        List<WebElement> checkboxes = driver.findElements(By.id("body > form > fieldset:nth-child(1)"));

        // Iterate over the checkboxes and click each one
        for(WebElement checkbox : checkboxes){
            checkbox.click();
            Thread.sleep(2000);  // Used only to observe the changes
        }

        // Iterate over the checkboxes and click each one to uncheck
        for(WebElement checkbox : checkboxes){
            checkbox.click();
            Thread.sleep(2000);  // Used only to observe the changes
        }

        // Switch back to the main webpage
        driver.switchTo().defaultContent();

        // Close the browser
        driver.close();
    }
}