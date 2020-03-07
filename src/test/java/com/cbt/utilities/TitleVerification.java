package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerification {

    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        String mainURL = "http://practice.cybertekschool.com";
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        List<String> titles = new ArrayList<>();
        List<String> urlsVisited = new ArrayList<>();

        for (String url : urls) {
            driver.get(url);
            titles.add(driver.getTitle());
            urlsVisited.add(driver.getCurrentUrl());
            Thread.sleep(2000);
        }

        for (int i = 0; i < 2; i++) {
            for (int j = i+1; j < titles.size(); j++) {
                System.out.print(titles.get(i) + " = " + titles.get(j) + "? -->> ");
                StringUtility.verifyEquals(titles.get(i), titles.get(j));
            }
        }

        for (String url : urlsVisited) {
            System.out.println("url starts with = " + mainURL + " = " + url.startsWith(mainURL));
        }

        driver.quit();

    }

}
