package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerification2 {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                                          "https://wayfair.com",
                                          "https://walmart.com",
                                          "https://westelm.com");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        for (String url : urls) {
            driver.get(url);
            String title = driver.getTitle().replace("https://", "").toLowerCase();
            System.out.println(title + " contains " + url +" ? = " + title.contains(url));
        }

        driver.quit();

    }

}
