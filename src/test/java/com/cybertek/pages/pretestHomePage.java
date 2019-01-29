package com.cybertek.pages;

import com.cybertek.unitilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pretestHomePage {

    public pretestHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Sign in")
    public WebElement signIn;


    //if the spesific T-SHIRT location is changed, we'll chage it here 
    public WebElement product(String productName){
        String xpath = "//h5//a[@title='"+productName + "'])[1]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }
}
