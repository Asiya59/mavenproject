package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressBook01 {
    public static void main(String[] args) {
        /*
        Basic authentication Address book
        1.Open browser
        2.Go to http://a.testaddressbook.com/sign_in
        3.Enter username kexesobepu@zsero.com
        4.Enter password password 
        5.Click sign in button
        6.Verify username is displayed on page
        7.Verify the title does not include Sign In

         */
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        driver.findElement(By.id("session_email")).sendKeys("kexesobepu@zsero.com");
        driver.findElement(By.id("session_password")).sendKeys("password");
        driver.findElement(By.name("commit")).click();

        String actual = driver.findElement(By.className("navbar-text")).getText();
        String expected = "kexesobepu@zsero.com";

        if(actual.equals(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expect: " + expected);
            System.out.println("actual: " + actual);
        }

         if(!driver.getTitle().contains("Sign In")){
             System.out.println("PASS");
         }else{
             System.out.println("Fail");
             System.out.println("actual title: " + driver.getTitle());
             System.out.println("expected title: " + "Address Book");
         }



      driver.close();



    }
}
