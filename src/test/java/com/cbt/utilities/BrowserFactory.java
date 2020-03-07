package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browser) {
        String OS = System.getProperty("os.name").toLowerCase();
        switch (browser) {
            case "edge":
                if (OS.contains("mac")) {
                    return null;
                } else {
                    WebDriverManager.edgedriver().setup();
                    return new EdgeDriver();
                }
            case "safari":
                if (OS.contains("windows")) {
                    return null;
                } else {
                    WebDriverManager.chromedriver().setup(); // no safari driver
                    return new ChromeDriver();
                }
//            case "chrome":
//                WebDriverManager.chromedriver().setup();
//                return new ChromeDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
        }
    }
}