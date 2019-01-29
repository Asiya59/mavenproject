package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchOptions {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("\"https://the-internet.herokuapp.com/tinymce\"");
    }
    @AfterMethod
    public void leanUp(){
        driver.quit();
    }

    @Test
    public void switchElement() {
        //locate the iframe
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        //swtichTo iframe
        driver.switchTo().frame(iframe);
        driver.findElement(By.tagName("body")).sendKeys("What a wonderful world!");
    }

    //2.using name or id of the iframe eleement

    @Test
    public void switchById(){
        //locate the iframe
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        //in here , we just pass the id instand of webelement
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.tagName("body")).sendKeys("What a wonderful girl");
        }
    //3.using indext

    @Test
    public void switchByIndex(){
        //locate the iframe
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        //in here , we just pass the id instand of webelement
        driver.switchTo().frame(1);
        driver.findElement(By.tagName("body")).sendKeys("What a wonderful girl");
        }


}
