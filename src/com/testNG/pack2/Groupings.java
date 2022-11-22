package com.testNG.pack2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;

public class Groupings {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("I am after method");
    }
    @Test(groups = {"smoke"})
    public void testMethod(){
        System.out.println("This is my first method");
    }
    @Test(groups = {"smoke"})
    public void anotherMethod(){

        System.out.println("this is another method in testing class");
    }
    @Test(groups = {"regression"})
    public void lastMethod(){

        System.out.println("I am the last method");
    }
}

