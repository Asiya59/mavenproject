package com.cybertek.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
    @Test
    public void test1(){
        System.out.println("starting");

        //in thstNG aslo called Junit, if any assartion fails, the rest test will be skipped

        Assert.assertTrue(false);
        System.out.println("done");
    }

    @Test
    public void test2(){
        SoftAssert sf = new SoftAssert();
        System.out.println("starting");
        sf.assertTrue(false);
        System.out.println("done");
        sf.assertAll();//go back and report which one is failed
        sf.assertEquals(3,1);
        sf.assertAll();
    }
    @Test
    public void test3(){
        SoftAssert sf = new SoftAssert();
        System.out.println("starting");
        sf.assertTrue(false);
        Assert.assertTrue(false);
        System.out.println("done");
        sf.assertAll();


    }
}
