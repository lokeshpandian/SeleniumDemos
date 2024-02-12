package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

import static org.example.BrowserSetup.driver;

public class Amazon {
    public static void main(String[] args) throws IOException {
        driver = BrowserSetup.BrowserSetup();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.co.uk/ref=nav_logo");
        driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).perform();
    }
    //create a method to open amazon

}
