package com.testNG.pack3;

import com.testNG.utils.CommonMethods;
import com.testNG.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderDemo1 extends CommonMethods {


    @DataProvider
    public Object[][] loginData() {
        Object[][] data = new Object[3][2]; // 3 rows and 2 columns
        data[0][0] = "Admin";
        data[0][1] = "Hum@nhrm123";
        data[1][0] = "Michael12345";
        data[1][1] = "Hum@nhrm123";
        data[2][0] = "Admin";
        data[2][1] = "Hum@nhrm123";

        return data;
    }

    @Test
    public void validLogin() {
        driver.findElement(By.id("txtUsername")).sendKeys(ConfigReader.getPropertyValue("username"));
        driver.findElement(By.id("txtPassword")).sendKeys(ConfigReader.getPropertyValue("password"));
        driver.findElement(By.id("btnLogin")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement welcomeAttribute = driver.findElement(By.xpath("//*[@id='welcome']"));
        Assert.assertTrue(welcomeAttribute.isDisplayed());


    }

    }


