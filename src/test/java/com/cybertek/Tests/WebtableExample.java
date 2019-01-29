package com.cybertek.Tests;

import com.cybertek.unitilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

public class WebtableExample extends TestBase {
    @Test
    public void printWholeTable(){
        login();
        WebElement table = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/table"));
        System.out.println(table.getText());

    }

    public void login() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);

    }
    @Test
    public  void printAllHeaders(){
        login();
        List<WebElement> headers = driver.findElements(By.xpath(".//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));

        for(WebElement x:headers){
            System.out.println(x);
        }
 }

    /*
       prints the number of rows
       prints all rows ==> prints the whole again
       prints the certain based on index
    */

    @Test
    public void printRow(){
        login();
        List<WebElement> allRows = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println("number of rows " + allRows.size());

        for(WebElement header:allRows){
            System.out.println(header.getText());
        }

        // print the nth
        System.out.println("Printing row " + 4);
        System.out.println(allRows.get(3).getText());
    }
    /*
   print the size: columns and rows in a table
    */
    @Test
    public void printTableSize(){
        login();

        List<WebElement> allRows = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println("Number of Rows " + allRows.size());

        List<WebElement> allColomns = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));
        System.out.println("Number of Colomns " + allColomns.size());

    }


   //  //*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[1]  -- > get the 1st row [2]--> get the 2nd row
    // wanna get 1st row of Paul name
    // //*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[2]//td
   @Test
   public void printRow2(){
       login();
       WebElement row2Element = driver.findElement(By.xpath("(//table[@id ='ctl00_MainContent_orderGrid'])/tbody/tr[3]"));
       String row2 = row2Element.getText();

       System.out.println(row2);

       /*
       or we can directly print it
        System.out.println(row2Element.getText())
        */
   }



   @Test
    public void printAllCellsInOneRow(){
        List<WebElement> cells  = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]//td"));

        for(WebElement header : cells){
            System.out.println(header.getText() + " + //////////");
        }
    }
//*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[1]

    /*
   print by coordinates : based on row and column number
    */
    @Test
    public void printByCoordinates(){
        login();
        WebElement cell = driver.findElement(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[11]"));
        System.out.println(cell.getText());

        System.out.println(getCell(6,11).getText());
    }

    public WebElement getCell(int row, int col){
        String xpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+row+"]/td["+col+"]";
        return driver.findElement(By.xpath(xpath));
    }

    //print horzentally . ex: print all names
    @Test
    public void printHorzental(){
        login();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        for(WebElement header : allNames){
            System.out.println(header.getText());
        }
    }
    @Test
    public void selectCCheckbod(){
        login();
        WebElement checkbox = driver.findElement(By.xpath("//td[.='Susan Mclaren']/../td[1]inout"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
    }



}
