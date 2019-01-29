package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EtsyExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://etsy.com");


       WebElement input = driver.findElement(By.id("search-query"));
        input.sendKeys("decal");

        WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        submit.click();

      // WebElement submit = driver.findElement(By.id());

     /*
     <button class = btn btn-primary" type="submit" value="search" aria-lable="search">
     </button>

     when we read it :
     element that has a tag "button" , has a attribute 'type' with the value 'submit'

     XPATH: //button[@type='submit']


     E- tag name
     A - attribute
     t - value of that attribute


     button[@type='submit']
        E[@A='t']

    ==============


      <input id="search-query" class="search-input clearable dropdown-relative-positioned rounded

                    " type="text" placeholder="Search for items or shops" name="search_query" value="" autocomplete="off" autocorrect="off" autocapitalize="off">



        for above element write it :
            input[@id='search-query']

          ===============


         if we have 2 same input, how to write it?
           -it has order, find mom firts, and then find which child

            //form[@id='checkboxes']/input[2]
            2 means above is 2nd input inside form
            ============
            in amazon there are a lot of 'Help' , for the second single one on the buttom
            How to find 2nd help link in amazon?
            //(a[.='Help'])[2]

             a[.='Help'] ---> it gives all Help, and we need 2nd one

               //command F

      */
driver.close();


// command F   --> enter the id number , ex: "query" , if there is only one id comes with "query"
//                  then we can fine element by id
        //           it is same for name class or others






    }
}
