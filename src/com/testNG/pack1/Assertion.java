package com.testNG.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Assertion {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 1, enabled = true)
    public void validLogin() {
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        /**
         * please verify the login
         */

        WebElement welcomeAttribute = driver.findElement(By.xpath("//*[@id='welcome']"));
        Assert.assertTrue(welcomeAttribute.isDisplayed());
        System.out.println("my assertion is passed ");

    }
    @Test(priority = 2, enabled = true)
    public void validationOfTitle(){
        String actualValue="Human Management Syste";
        String expectedText= driver.getTitle();
        Assert.assertEquals(actualValue,expectedText,"Values are not matching");
        System.out.println("I am executing after assertion");


    }

    @AfterMethod
    public void tearDown () {
        driver.quit();
    }
}
