package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static org.example.BrowserSetup.driver;


public class JavascriptExecutordemo {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {
        WebDriver driver = BrowserSetup.BrowserSetup();
        driver.get("https://www.amazon.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('twotabsearchtextbox').value='selenium';");
        WebElement element = driver.findElement(By.xpath("(//a[@class='nav_a'])[11]"));
        js.executeScript("arguments[0].click();", element);

        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}




