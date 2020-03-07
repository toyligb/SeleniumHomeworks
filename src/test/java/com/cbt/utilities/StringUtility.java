package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String expected, String actual) {
        System.out.println(expected.equalsIgnoreCase(actual) ? "PASS" : "FAIL");
    }

}
