package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) throws Exception {
        chromeTest();
//        firefoxTest();
//        edgeTest();
    }

    public static void chromeTest() throws Exception {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String t1 = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().to("https://etsy.com");
        String t2 = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().back();
        StringUtility.verifyEquals(t1, driver.getTitle());
        Thread.sleep(2000);

        driver.navigate().forward();
        StringUtility.verifyEquals(t2, driver.getTitle());
        Thread.sleep(2000);

        driver.quit();
    }

    public static void firefoxTest() throws Exception {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String t1 = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().to("https://etsy.com");
        String t2 = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().back();
        StringUtility.verifyEquals(t1, driver.getTitle());
        Thread.sleep(2000);

        driver.navigate().forward();
        StringUtility.verifyEquals(t2, driver.getTitle());
        Thread.sleep(2000);

        driver.quit();
    }

    public static void edgeTest() throws Exception {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String t1 = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().to("https://etsy.com");
        String t2 = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().back();
        StringUtility.verifyEquals(t1, driver.getTitle());
        Thread.sleep(2000);

        driver.navigate().forward();
        StringUtility.verifyEquals(t2, driver.getTitle());
        Thread.sleep(2000);

        driver.quit();
    }

}
