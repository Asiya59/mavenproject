package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CraglistTest {
    public static void main(String[] args) {

        //
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://washingtondc.craigslist.org/");

       // driver.findElement(By.name("query")).sendKeys("corolla");

        //if it is a link, we use this , for "electronic" link in the website, we can jusy tyoe the name
      driver.findElement(By.linkText("beauty")).click();

      //we want to click  "farm+garden", but we just entered jusr part of it
      //driver.findElement(By.partialLinkText("+garden")).click();


        //if the class name has a space, we cannot use it


        //how do u get all the # of links in the page?
            //



    }
}
