package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfiguration {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://m.facebook.com/login/?locale=en_GB");
        driver.navigate().to("https://www.google.co.uk/");

        //print the title of the page
        System.out.println(driver.getTitle());
        //print the current url of the page
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


        driver.close();




    }
}
