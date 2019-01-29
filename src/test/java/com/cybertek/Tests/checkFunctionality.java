package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkFunctionality {
    public static void main(String[] args) {
        /*Verify checkbox functionality
        1.Open browser
        2.Go to http://the-internet.herokuapp.com/checkboxes
        3.Verifythe first checkbox is not selected
        4.Verifythe second checkbox is selected
        5.Click on the first checkbox
        6.Verifythe first checkbox is selected
        7.Verifythe second checkbox is selected
        8.Click on the second checkbox
        9.Verifythe first checkbox is selected
        0.Verifythe second checkbox is not selected
         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/checkboxes");

        Select list = new Select(driver.findElement(By.id("checkboxes")));



    }
}
