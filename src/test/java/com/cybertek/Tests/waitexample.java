package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class waitexample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //it only wait when you cannot find sth
        //when the element name is wrong, or it cannot find, it will wait for 10 second, and then shows error
        //this should be before we find the element
        //if there is two timer, it will take the second one

        //this like Thread.sleep(2000) in java code
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //make the screen bigger
        driver.manage().window().fullscreen();


        driver.get("http://newtours.demoaut.com/");
        //username tutorial
        //password tutorial

        driver.findElement(By.name("userName")).sendKeys("tutorial");
        driver.findElement(By.name("password")).sendKeys("tutorial");






       // driver.close();
    }
}
