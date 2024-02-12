package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

import static org.example.BrowserSetup.driver;

public class NewWebsite {
    public static void main(String[] args) throws IOException {
        driver = BrowserSetup.BrowserSetup();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/");
        driver.findElement(By.linkText("Droppable")).click();
        WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(source).moveToElement(target).release().build().perform();


    }

}
