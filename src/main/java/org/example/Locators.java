package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Locators {
    static WebDriver driver;
    public static void main(String[] args) {
        driver= BrowserSetup.BrowserSetup();
        driver.manage().window().maximize();

        driver.get("https://www.mycontactform.com/samples.php");
        driver.findElement(By.linkText("Sample Forms")).click();
       driver .findElement(By.name("email_to[]")).click();
               driver.findElement(By.xpath( "//input[@name = 'subject'] ")).sendKeys("Hello");
               driver.findElement(By.id("email")).sendKeys("Lokeshpandian@gmail.com");
driver.findElement(By.id("q1")).sendKeys("Hello");
driver.findElement(By.id("q2")).sendKeys("World");
//WebElement dropdown = driver.findElement(By.id("q3"));
 //dropdown.click();
//WebElement radioButton = driver.findElement(By.id("q4"));
//radioButton.click();
//WebElement checkBox1 = driver.findElement(By.id("q5"));
//checkBox1.click();
//driver.findElement(By.name("q7")).sendKeys("10/10/2021");
//driver.findElement(By.name("q9")).sendKeys("India");
//driver.findElement(By.name("q11_title")).sendKeys("Mr.");
//driver.findElement(By.name("q11_first")).sendKeys("Lokesh");
//driver.findElement(By.name("q11_last")).sendKeys("Pandian");
//driver.findElement(By.id("visver_code")).sendKeys("123456");
//List<WebElement>radioButtons = driver.findElements(By.xpath("//input[@type = 'radio']"));
//System.out.println("RadioButtons"+ radioButtons.size());
//List<WebElement>dropdowns = driver.findElements(By.xpath("//select"));
//System.out.println("Dropdowns"+ dropdowns.size());
List<WebElement> links = driver.findElements(By.xpath("//a"));
System.out.println("Links"+ links.size());
for(int i = 0;i<links.size();i++){
          // links.get(i).click();
           //driver.get(driver.getCurrentUrl());//to click on links
    System.out.println(links.get(i).getText());

        }
        }





    }


