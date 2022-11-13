package com.testNG.class1;

import org.testng.annotations.Test;

public class PriorityAttribute {

    @Test(priority = 3)
    public void loginMethod(){
        System.out.println("I am login method");
    }
    @Test(priority = 1)
    public void launchBrowserMethod(){
        System.out.println("I am launch browser");
    }
    @Test(priority = 2)
    public void navigateUrl(){
        System.out.println("I am navigate url");
    }
    @Test(priority = 4)
    public void closeBrowser(){
        System.out.println("I am close browser method");
    }
}
