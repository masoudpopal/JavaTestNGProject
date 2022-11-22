package com.testNG.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertion2 {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test(groups = {"smoke"})
    public void validLogin() {
        String titleExpected="Human Resource Management System";
        String titleActual = driver.getTitle();

        SoftAssert soft =new SoftAssert();
        soft.assertEquals(titleExpected,titleActual);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement welcomeAttribute = driver.findElement(By.xpath("//*[@id='welcome']"));
        soft.assertFalse(welcomeAttribute.isDisplayed());

        String expectedText = welcomeAttribute.getText();
        String actualText="welcome Admin123";
        soft.assertEquals(expectedText,actualText);
        System.out.println("My statement after all assertions");
        soft.assertAll();

    }
    @Test(groups = {"regression"})
    public void invalidLogin(){
        String titleExpected="Human Resource Management System";
        String titleActual = driver.getTitle();

    }


    @AfterMethod(alwaysRun = true)
    public void tearDown () {
        driver.quit();
    }
}
