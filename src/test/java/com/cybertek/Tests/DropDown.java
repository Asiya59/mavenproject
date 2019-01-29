package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        //locate an element with tag slect
        WebElement slectElement = driver.findElement(By.id("dropdown"));

        //cretate select object
        Select list = new Select(slectElement);


        //getOption --> this method will get all options
        //getFirstSelectedOption --> get the 1st one only
        //in this, even the question itself can be an option too
        //"Please select an option" "option1" "option2"  --> 3 options

       //this take the option which the website has, and there is only one
       String slectOption = list.getFirstSelectedOption().getText();
        System.out.println(slectOption);   //  "Please select an option"

        //print all avaliable options
        // List<String> options = list.getOptions().getText();
        List<WebElement> options = list.getOptions();
        System.out.println("options.size() = " + options.size());

        for(WebElement option : options){
            System.out.println(option.getText());

        }

        //select different options

        //1. by visible text

        //this line select whatever we enter, and next line when we can get 1st line
        list.selectByVisibleText("Option 2");
        System.out.println("Selected option by visiable text: " +
                   list.getFirstSelectedOption().getText());

        //2.By visible index , if give 0 , nothing will select
        list.selectByIndex(2);
        //we do not care about the text , count is 0 base, alsa get 1st after we slected
        System.out.println("Selected option by index: " +
                list.getFirstSelectedOption().getText());


        //3.by value attribute (not use a lot)

        //open HTML, and find the value, and then put that value
        list.selectByValue("1");
        //we do not care about the text , count is 0 base
        System.out.println("Selected option: " +
                list.getFirstSelectedOption().getText());









    }

}
