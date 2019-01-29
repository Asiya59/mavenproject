package AbsoluteXpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intro {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //use parent/child html
        //
       // driver.get("https://the-internet.herokuapp.com/upload");

        //1.absolute Xpath
        //find UPLOad's absolute Xpath
        //  /html/body/div/div/div/form/input

      //  bad:  if html chage, xpath will stop working
        //      tends to very long, easy mistake becasue we do it manually



      //2.relitive xpath
      //tag[@attribute='value]   E[A@'T'] -->singgel ''  ,   if use ""    E[A@\"T\"]
      //it will go to src , and check the tag , if it matches, then look at all attributes
      //even if html change, it still can find it

      //3.Nth child
     // in abouve fount ablolute xpath
        //there are 2 input
        //if want 2nd one
        ///html/body/div/div/div/form/input[2]    not always be in the last one, can be div/dive[2]/form/input like that

        driver.get("https://the-internet.herokuapp.com/frames");


        //4.any singgle tag  //commad +f
        //  //ul/li[2] : any tag
        //  //ul/li[2] = /html/body/div/div/


       // 5.By exat text
          //tag[.='text']
       // . means  exect text
       // <h3>Frames</h3>   --> //h3[.='Frames']  case sensitive

     //   6.by partial text
      //      //tag[contains(text(),'text')]
    //    h3[contains(text(),'Fra')]

        /*
        7. any element with certain text .\, attribute
        //*[.='Frame']  :any tag with  text Frame

         for amazon sell botton
          //a[.='Sell']

        8.Nth match
        ////a[.='Help']
        it has 2 Help
        1.write xpath that matches both
            //a[.='Help']
         2.slect 2nd , put()
         (//a[.='Help'])[2]


        9.
         dynamic means can be change, and it is not reliable, html changes, the xaoth or id do not work
         id="j_idt691" like this is dynamic

         dynamic attribute: contains, starts, ends


        //tag[contains(@attibute,'valye')]
        //tag[starts-wth(@attibute,'valye')]
        //tag[ends-wth(@attibute,'valye')]

          //button[contains(@id,'j_idt691')]

           10.using 2 or more xpath
           locate the whole are which cover that specific item,
           1-->write an xpath wihci mathes multiple elements
           //a[.='Help']
           2-->write an xpath that locates the secction if the page where my elemet is
            //div[@id='navFooter']
           3--->mixx and patch
            //div[@id='navFooter']//a[.='Help']

         */






    }
}
