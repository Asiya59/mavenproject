package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframeDemo {
    //this is gonna be one class and one method, so we didi not use before method things like that

    //there are two html in this website
    //so we are not able to locate it with thgs we learned before

    //it has iframe tag , we can use it  : it used to put one html document inside another one
   // ifame is totally different html , if there are multi adds in a website, taht means multi iframe

      /*html
         title
         text
         link

         iframe
            html
               link

      selenium can see only one html document at a time. it also can see iframe, but cannot see what is indide .




      in the multi one,
        html              fedault content

          iframe1           frame1

             html1
               iframe2      frame2: is inside frame1
                 html2

      to get frame2
       1-step : switch to iframe1
       2-step : switch to iframe2


       to go back:
       1. driver.switchto().defaultContent()  --> this goes back to top level


       if I want to just go beck to frame1

        driver.switchTo().parentFrame(); --> this goes back right before





       */

   @Test
    public void test(){
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.get("https://the-internet.herokuapp.com/tinymce");
       //locaye iframe
       WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
       //switc to iframe
       driver.switchTo().frame(iframe);

       driver.findElement(By.tagName("body")).sendKeys("What a wonderful world!");

       //we want tp click elemental selenium, but it is noy in iframe, it is in the 1st one
       //should go back to perivious html
       driver.switchTo().parentFrame();
       driver.findElement(By.linkText("Elemental Selenium")).click();



   }

}
