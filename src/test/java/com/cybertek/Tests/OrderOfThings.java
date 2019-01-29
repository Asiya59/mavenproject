package com.cybertek.Tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OrderOfThings {

    @Test(priority  =1)// in this case this test will run first , smaller the number priority is higher EX: 0 will run before 1 , -1 will run before 0
    public void test1(){
        System.out.println("Executing 1");
    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("Executing 2");
    }
    @Test(priority = 3)
    public void test3(){
        System.out.println("Executing 3");
    }
//    @Test
//    public void atest2(){
//        // testing order is alphabetical so when we add "a" before test2 it runs first , but this is not always a good idea
//        System.out.println("Executing 2");
//    }

    // we can also Skip tests by "//" the @Test annotation but this is not a good way to do
  //  Example

  //  @Test
    public void test4() {
        System.out.println("Executing 4"); // this will not be considered a test due to its annotation is being commented out
    }

    @Ignore
    // this annotation is used to skip tests so when we run all tests this will not run
    @Test(priority = 2)
    public void test5(){
        System.out.println("Executing 5");
    }



}
