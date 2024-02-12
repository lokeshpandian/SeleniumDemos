package org.example;

import org.openqa.selenium.By;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.example.BrowserSetup.driver;

public class WindowHandling {
    public static void main(String[] args) throws IOException {
        driver = BrowserSetup.BrowserSetup();
        driver.manage().window().maximize();
        driver.get("https://nxtgenaiacademy.com/multiplewindows/");
        driver.findElement(By.name("newbrowserwindow123")).click();
        driver.findElement(By.name("123newmessagewindow321")).click();
        Set<String> windows = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(windows);
        driver.switchTo().window(windowList.get(1));
        System.out.println(driver.getTitle());
        driver.switchTo().window(windowList.get(0));
        System.out.println(driver.getTitle());
    }

}
