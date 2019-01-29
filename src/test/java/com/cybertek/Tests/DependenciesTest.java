package com.cybertek.Tests;

import org.testng.annotations.Test;

public class DependenciesTest {
    @Test
    public void login(){
        System.out.println("login");
    }
    @Test(dependsOnMethods = "login") // this means this test will not run if "login test" fails

    public void zbuySth(){// z before it will make it run later because they run in alphabetical order
        System.out.println("buy buy baby");
    }
    @Test
    public void homePage(){
        System.out.println("home page");
    }


}
