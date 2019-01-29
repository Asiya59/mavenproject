package com.cybertek.unitilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected SoftAssert softAssert;


      //since we have Driver class, and we called the getDriver method, so we dont need this
//    @BeforeClass
//    public void setUpClass(){
//        WebDriverManager.chromedriver().setup();
//    }

    @BeforeMethod
    public void setUpMethod(){
        driver = Driver.getDriver();  // from now on, we just call Driver class's method
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        actions = new Actions(driver);
        softAssert = new SoftAssert();
    }

    @AfterMethod
    public void tearDownMethod() {
        Driver.closeDriver();
        softAssert.assertAll();

    }


}
