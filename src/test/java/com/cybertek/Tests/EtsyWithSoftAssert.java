package com.cybertek.Tests;
import com.cybertek.unitilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class EtsyWithSoftAssert extends  TestBase {
    @Test
    public void test() {
        driver.get("https://etsy.com");
        driver.findElement(By.id("search-query")).sendKeys("gift" + Keys.ENTER);

        softAssert.assertTrue(driver.getTitle().contains("asi"), "title did not match");

        Assert.assertTrue(driver.getTitle().contains("AAA"));



    }


}
