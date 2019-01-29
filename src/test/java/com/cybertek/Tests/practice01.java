package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice01 {
    public static void main(String[] args) {
        /*Search Amazon
        1.Open browser
        2.Go to https://amazon.com
        3.Enter any search term
        4.Click on search button
        5.Verifytitle contains the search term


         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        //web element
        String searchitem = "book";
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchitem);






    }
}
