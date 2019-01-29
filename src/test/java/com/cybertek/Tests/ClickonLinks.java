package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonLinks {
    /*
    Click on links
    1.Open browser
    2.Go to https://the-internet.herokuapp.com/
    3.Click link File download
    4.Verify title contains on download
    5.Navigate to previous page
    6.Click link File upload
    7.Verify title contains on upload
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("File Download")).click();

        if(driver.getCurrentUrl().contains("download")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual title: " + driver.getCurrentUrl());
            System.out.println("expected title: " + "https://the-internet.herokuapp.com/download");
        }


        driver.navigate().back();
        driver.findElement(By.linkText("File Upload")).click();

        if(driver.getCurrentUrl().contains("upload")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual title: " + driver.getCurrentUrl());
            System.out.println("expected title: " + "https://the-internet.herokuapp.com/upload");
        }



         driver.close();



    }
}
