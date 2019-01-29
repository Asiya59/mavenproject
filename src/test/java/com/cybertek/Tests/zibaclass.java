package com.cybertek.Tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class zibaclass {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
    }



    @BeforeMethod
    public void run(){
        driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
    }

    @Test
    public void verifyTitle(){
        driver.findElement(By.id("session_email")).sendKeys("kexesobepu@zsero.com");
        driver.findElement(By.id("session_password")).sendKeys("password");
        driver.findElement(By.name("commit")).click();
        Assert.assertEquals(driver.getTitle(),"Address Book");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
