package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TabExample {
    /*
    Test case:
    go to http://the-internet.herokuapp.com/windows
    click on click “Click here”

    verify that new title is “New window”
    verify that new title is not “The internet”
     */
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");
    }
    @AfterMethod
    public void leanUp() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }


    @Test
    public void chageTab() {
        //give the id's all current tabs
        //here it is before go to next page
        System.out.println(driver.getWindowHandles().size());
        driver.findElement(By.linkText("Click Here")).click();
        //here it is after the page
        System.out.println(driver.getWindowHandles().size());
        //change to new tab
        Set<String> windowhandle = driver.getWindowHandles();

        for (String handle : windowhandle) {
            System.out.println(handle);
            //switching the tab
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());

            if (driver.getTitle().equals("New Window")) {
                break;
            }
        }

        Assert.assertEquals(driver.getTitle(), "New Window");
    }

        @Test
        public void changeTab2 () {
            driver.get("https://www.w3schools.com/html/");
            driver.findElement(By.linkText("Try it Yourself")).click();


            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
                if (driver.getTitle().equals("Tryit Editor v3.6")) {
                    break;
                }
            }

            Assert.assertTrue(driver.getCurrentUrl().contains("default"));
        }
            /*set is just like Arraylist withoutduplicate values, also it does get method





             */

    }