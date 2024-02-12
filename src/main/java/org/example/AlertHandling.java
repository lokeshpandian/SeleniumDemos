package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.io.IOException;

import static org.example.BrowserSetup.driver;

public class AlertHandling {
    public static void main(String[] args) throws IOException {
        driver = BrowserSetup.BrowserSetup();
        driver.manage().window().maximize();
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
        driver.findElement(By.name("promptalertbox1234")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Lokesh");
    }
}
