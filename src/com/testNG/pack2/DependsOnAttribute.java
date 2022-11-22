package com.testNG.pack2;

import org.testng.annotations.Test;

public class DependsOnAttribute {


    @Test
    public void login(){
        System.out.println("this is my login method");
    }
    @Test(dependsOnMethods = "login")
    public void verifyDashboardPage(){
        System.out.println("this is my dashboard page");
    }
    @Test(dependsOnMethods = {"login","verifyDashboardPage"})
    public void verifyLogOut(){
        System.out.println("this is my logOut page");
    }

}
