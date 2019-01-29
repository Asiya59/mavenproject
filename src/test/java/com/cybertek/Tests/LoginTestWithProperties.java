package com.cybertek.Tests;

import com.cybertek.unitilities.ConfigurationReader;
import org.testng.annotations.Test;

public class LoginTestWithProperties {

    @Test
    public void readPropertyTest(){
        //we need to things , the key never changes, but we may change the value
        //should not have space-->  "browser = chrome" ;   should be"browser=chrome"
        //1.key is browser , 2.value is chrome --> they are in congifuration.properties file

                                                      //it just get the key , not value
        String browser = ConfigurationReader.getProperty("browser");
        System.out.println(browser);//this gives chrome

    }






}
