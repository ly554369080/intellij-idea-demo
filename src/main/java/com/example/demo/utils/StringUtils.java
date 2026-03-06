package com.example.demo.utils;

public class StringUtils {
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(reverse(cleaned));
    }

    public static String toUpperCase(String str) {
        return str != null ? str.toUpperCase() : null;
    }

    public static String toLowerCase(String str) {
        return str != null ? str.toLowerCase() : null;
    }
}
