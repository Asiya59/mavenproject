package com.cybertek.Tests;

/*
go to https://the-internet.herokuapp.com/forgot_password
verify enter email and submit
verify email sent message on the next page
 */
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static void main(String[] args) {
        //this is already done by sb , we do not need that
      //  System.setProperty("sds","dssf");
/*
need internent for maven? what if company blocks internent ?
  --> Compamoies have thier local repository (local nexus)
       they download and tets the required libraries in thier nexus first


 */

        //we just need to call this after create maven project
        //this garentee driver open any webside
        //
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/forgot_password");
        WebElement input = driver.findElement(By.id("email"));
                                                                //this enter the text also hit the enter on the computer
        input.sendKeys("someemail@somemail.com" + Keys.ENTER);
                                                                //it aslways comes with String
        //input.submit(); it will submit it if there is an button , otherwise use Keys.Enter


        String expected = "Your e-mail's been sent!";
        String actual = driver.findElement(By.id("content")).getText();

        if(actual.equals(expected)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }

        driver.close();





    }
}
