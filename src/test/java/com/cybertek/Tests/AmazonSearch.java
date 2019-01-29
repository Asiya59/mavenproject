package com.cybertek.Tests;
/*
open browser
go to amazon
enter search term and submit
verify search box still contains the same search term

 */
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
       WebElement input = driver.findElement(By.id("twotabsearchtextbox"));

        input.sendKeys("charger" + Keys.ENTER);

        String expected = "charger";
        String actual = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");


//        //getText() does not work when we have dinamic boxes , elements are special , it cannot get it
//        //in our case, it shoues Fail , anctual resualt was emoity,
//
//        /*
//        we can get element by :
//        1.element.getText();
//        2.element.getAttribute();
//
//        3.rerelly use it
//           element.getAttribute("innerHTML);
//         */
//
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
