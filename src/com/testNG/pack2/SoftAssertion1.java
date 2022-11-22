package com.testNG.pack2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion1 {

    @Test(groups = {"smoke"})
    public void softAssertionValidation(){
        String expected = "Batch 10 is one of the best batches";
        String actual ="Batch 10 is one of the worst batches";


        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(expected,actual);
        System.out.println("my code after first assertion");

        softAssert.assertTrue(false);
        System.out.println("my code after the second assertion");

        softAssert.assertFalse(true);
        System.out.println("my code after the third assertion");

        softAssert.assertFalse(false);
        System.out.println("my code after fourth assertion");

        String newExpected="This is last assertion";
        String newActual="This is last assertion";
        softAssert.assertEquals(newActual,newExpected);

        // to collect all the assertion information we need to call assertAll method
        //this should be the last statement of your test
        softAssert.assertAll();
    }
    @Test(groups = {"smoke"})
    public void anotherMethod(){
        System.out.println("Test method");
    }
}
