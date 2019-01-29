package com.cybertek.Tests;

import com.sun.xml.internal.ws.api.server.WebServiceContextDelegate;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;


public class departmentTest {
WebDriver driver ;
Select allDepartments;

    @BeforeClass
    public void setUpMethod(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
//         driver.manage().timeouts().implicitlyWait(5)
        driver.get("https://amazon.com");
    }



    @Test(priority = 0)
    public void testDefaultValue(){
        //finding the element with a select tag
      WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));

        // create a Select class object
        allDepartments = new Select(selectElement);

        // get the current selected option
        String selectedOption = allDepartments.getFirstSelectedOption().getText();

        // Verify that default dropdown option is all
        //TODO skipping because failing
         Assert.assertEquals(selectedOption,"All Departments");

    }


        // verify that all options are sorted alphabetically
        @Test(priority = 1)
        public void sortAlphabetical(){
       //using the compare to method, we will compare each element in the list to the next one
        for(int i=0;i<allDepartments.getOptions().size();i++){
            String current =allDepartments.getOptions().get(i).getText();
            String next =allDepartments.getOptions().get(i+1).getText();
            System.out.println("comparing :"+current +"with "+next);
            Assert.assertTrue(current.compareTo(next)<=0);
        }

    }

    @Test
    public void mainDepartmentsTest()throws  InterruptedException{
driver.findElement(By.cssSelector("i.hm-icon.nav-sprite")).click();
Thread.sleep(2000);// we have to wait till the button is clickable
driver.findElement(By.cssSelector("/gp/site-directory?ref_=nav_em_T1_0_2_2_33__fullstore"));
//capture  all of the main department names in the page


        List<WebElement> mainDepts = driver.findElements(By.cssSelector("h2.fsdDeptTitle"));

        for (WebElement option :
                mainDepts) {
            System.out.println(option.getText());
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
