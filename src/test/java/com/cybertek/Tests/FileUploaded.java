package com.cybertek.Tests;

import com.cybertek.unitilities.TestBase;
import org.testng.annotations.Test;

public class FileUploaded extends TestBase {
    /*
    go to https://the-internet.herokuapp.com/upload
upload file
click upload
verify text uploaded
     */

    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/upload");
    }



}
