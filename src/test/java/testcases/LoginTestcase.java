package testcases;

import org.apache.commons.io.FileUtils;
import org.example.BrowserSetup;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static org.example.BrowserSetup.driver;

@Test
public class LoginTestcase {

    public void beforeTest() {

        WebDriver driver = BrowserSetup.BrowserSetup();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");

    }

    @Test(priority = 1)
    public void positiveLogin () {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username = driver.findElement(By.name("username"));
        Assert.assertTrue(username.isDisplayed());
        WebElement password = driver.findElement(By.name("password"));
        Assert.assertTrue(password.isDisplayed());
        WebElement submitButton = driver.findElement(By.id("submit"));
        username.sendKeys("student");
        password.sendKeys("Password123");
        submitButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"),
                "User not logged in successfully!");

    }
    @Test(priority = 2)
    public void negativeLogin() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username = driver.findElement(By.name("username"));
        Assert.assertTrue(username.isDisplayed());
        WebElement password = driver.findElement(By.name("password"));
        Assert.assertTrue(password.isDisplayed());
        WebElement submitButton = driver.findElement(By.id("submit"));
        username.sendKeys("incorrectUser");
        password.sendKeys(" Password123");
        submitButton.click();
        WebElement errorMessage = driver.findElement(By.id("error"));

        // Verify if the error message is displayed
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed.");

        // Verify the text of the error message
Assert.assertEquals(errorMessage.getText(), "Your username is invalid!", "Incorrect error message text.");
//
    }
    @Test(priority = 3)
    public void negativePassword(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username = driver.findElement(By.name("username"));
        Assert.assertTrue(username.isDisplayed());
        WebElement password = driver.findElement(By.name("password"));
        Assert.assertTrue(password.isDisplayed());
        WebElement submitButton = driver.findElement(By.id("submit"));
        username.sendKeys("student");
        password.sendKeys("incorrectPassword");
        submitButton.click();
        WebElement errorMessage = driver.findElement(By.id("error"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed.");
        Assert.assertEquals(errorMessage.getText(), "Your password is invalid!", "Incorrect error message text.");

    }
    @AfterTest
    public void afterTest() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
 File screenshot = ts.getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(screenshot, new File("C:\\Users\\Lokes\\SeleniumDemos\\src\\main\\java\\org\\example\\ screenshot3.png"));
        //driver.quit();
    }
    }

