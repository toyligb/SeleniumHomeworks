package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerification3 {

    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com",
                "https://walmart.com",
                "https://westelm.com");

        for (String url : urls) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get(url);
            String title = driver.getTitle().replace(" ", "").toLowerCase();
            System.out.println(url + " contains " + title + "? = " + url.contains(title));
            driver.quit();
            Thread.sleep(2000);
        }

    }

}
