package com.cybertek.Tests;

import com.cybertek.pages.HomePage;
import com.cybertek.unitilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidationTest extends TestBase {
    /*
Wrong username
1. go to website http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx (Links to an external site.)Links to an external site.
2. try to login with wrong username
3. verify error message Invalid Login or Password.
     */
    HomePage homePage = new HomePage();

    @Test
    public void wrongUsernameTest(){

       driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
       homePage.username.sendKeys("admin");
       homePage.password.sendKeys("test");
       homePage.loginButton.click();


//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("admin");
//        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String error = "Invalid Login or Password.";
        String actualError = homePage.erroMassage.getText();
        Assert.assertEquals(error,actualError);
    }

    @Test
    public void wrongPasswordTest(){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        homePage.username.sendKeys("Tester");
        homePage.password.sendKeys("wrongpassword");
        homePage.loginButton.click();

//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("wrong password");
//        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String expectedError = "Invalid Login or Password.";
        String actualError = homePage.erroMassage.getText();
        Assert.assertEquals(expectedError,actualError);

    }


    //we made a method to take both username and password, so above and blow works same
    @Test
    public void blankUsername(){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        homePage.login("","Test");
        String expectedError = "Invalid Login or Password.";
        String actualError = homePage.erroMassage.getText();
        Assert.assertEquals(expectedError,actualError);
    }



}
