package com.testNG.pack1;

import org.testng.annotations.*;

public class TestNGClass {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before suite");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("I am after suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before the class");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am after the class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }



    @Test
    public void testMethod(){
        System.out.println("This is my first method");
    }
    @Test
    public void anotherMethod(){
        System.out.println("this is another method in testing class");
    }
    @Test()
    public void lastMethod(){
        System.out.println("I am the last method");
    }
}
