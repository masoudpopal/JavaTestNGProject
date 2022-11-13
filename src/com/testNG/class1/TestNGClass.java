package com.testNG.class1;

import org.testng.annotations.Test;

public class TestNGClass {

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
