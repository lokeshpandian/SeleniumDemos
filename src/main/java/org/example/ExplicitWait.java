package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.example.BrowserSetup.driver;

public class ExplicitWait {
    public static void main(String[] args) throws IOException {
        driver = BrowserSetup.BrowserSetup();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.findElement(By.id("display-other-button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
        driver.findElement(By.id("hidden")).click();




    }

}
