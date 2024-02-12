package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

import static org.example.BrowserSetup.driver;

public class Loc {
    public static void main(String[] args) throws IOException {
        driver = BrowserSetup.BrowserSetup();
        driver.manage().window().maximize();
        driver.get("https://www.mycontactform.com/samples.php");
       // WebElement sampleForms = driver.findElement(By.linkText("Sample Forms"));
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshot = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot, new File("C:\\Users\\Lokes\\SeleniumDemos\\src\\main\\java\\org\\example\\ screenshot.png"));


    }
}
