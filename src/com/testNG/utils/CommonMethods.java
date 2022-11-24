package com.testNG.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonMethods {

    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        ConfigReader.readProperties("C:\\Users\\masou\\IdeaProjects\\TestNGJavaProject\\src\\com\\testNG\\config\\config.properties");
        switch (ConfigReader.getPropertyValue("browser")) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.out.println("browser not available");
                break;
            default:
                throw new RuntimeException("invalid browser name");
        }
            driver.get(ConfigReader.getPropertyValue("url"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){

        driver.quit();
    }
}



