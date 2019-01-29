package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class retrivePassword {
    /*
    Retrieve password
    1.Open browser
    2.Go to https://the-internet.herokuapp.com/forgot_password
    3.Enter any email
    4.Click on Retrieve password
    5.Verify url contains email_sent
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.findElement(By.id("email")).sendKeys("abc@abc.com");
        driver.findElement(By.xpath("//*[@id=\"form_submit\"]/i")).click();

        if(driver.getCurrentUrl().contains("email_sent")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual url: " +driver.getCurrentUrl());
            System.out.println("expected url: " + "https://the-internet.herokuapp.com/email_sent");
        }
        driver.close();



    }

}
