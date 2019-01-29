package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    /*
    Basic authentication Zero bank
    1.Open browser
    2.Go to http://zero.webappsecurity.com/login.html
    3.Enter username username
    4.Enter password password
    5.Click sign in button
    6.Verify username is displayed on page
    7.Verify the title Zero -Account Summary

     */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();

        String expected = "username";
        String actual = driver.findElement(By.linkText("username")).getText();

        if(actual.equals(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expect: " + expected);
            System.out.println("actual: " + actual);
        }

        if(driver.getTitle().equals("Zero - Account Summary")){
            System.out.println("PASS");
        }else{
            System.out.println("Fail");
            System.out.println("actual title: " + driver.getTitle());
            System.out.println("expected title: " + "Zero - Account Summary");
        }


        //driver.close();

/*
          id-->
          name-->
          class--
          TagName
          linkText----when u find link, driver.findelement(By.linkText("")).getText();
          css
          Xpath-->copy
 */




    }


}
