package com.cybertek.Tests;

import com.cybertek.unitilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class SleepAndImplicitwaitExample {
    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = Driver.getDriver();
    }

    @AfterMethod
    public void cleanUp() {
        Driver.closeDriver();
    }

    @Test
    public void testSleep() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(10000);

        System.out.println(driver.findElement(By.id("finish")));
    }

    @Test
    public void implicitWait() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.tagName("button")).click();

        System.out.println(driver.findElement(By.id("finish")).getText());

    }

    @Test
    public void implicitWait2() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //click on button
        driver.findElement(By.cssSelector("form#checkbox-example>button")).click();

        //print the message
        System.out.println(driver.findElement(By.id("message")).getText());
        // click on add button
        driver.findElement(By.cssSelector("form#checkbox-example>button")).click();
        //verify checkbox is displayed
        System.out.println(driver.findElement(By.id("checkbox")).isDisplayed());

    }

    @Test
    public void test() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_controls");

        //click on the enable
        Driver.getDriver().findElement(By.xpath("")).click();
        // WebdriverWait is used to explicit wait
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //wait.until() is when waits happens
        //we are waiting for certail element to be clickable
        wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));

    }
}