package com.cybertek.unitilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
    //we wanna use Webdriver only from TestBase parent
    /*Singleton design patteren : share same object accross the all class of the application

     */
    //this is common using driver declaration

    private static WebDriver driver;


   //check if driver has value  and if it is initialized
    //for the first time driver is null
    public static WebDriver getDriver() {
        if (driver == null){
          //  WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver=new InternetExplorerDriver();
                    break;

            }
    }
        return driver;
   }

     //because of this class, we cannot have driver.quite directly
    //without making the object null, make it quite, we will get webdriver exception
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
