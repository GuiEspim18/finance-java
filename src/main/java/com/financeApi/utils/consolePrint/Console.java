package com.financeApi.utils.consolePrint;

public class Console {

    private static int titleMaxLength;

    public static void divide() {
        int maxLength = 50;
        if (titleMaxLength > 0) {
            maxLength = titleMaxLength;
        }
        String divisor = "";
        for (int i = 0; i < maxLength; i++) {
           divisor += "_";
        }
        System.out.println(divisor);
    }

    public static void divide(int length) {
        String divisor = "";
        for (int i = 0; i < length; i++) {
            divisor += "_";
        }
        System.out.println(divisor);
    }

    public static void title(String title) {
        int length = title.length();
        int maxLength = 50;
        int difference = 0;
        if (length <= maxLength) {
            difference = maxLength - length;
        }
        String titleStr = setStringUnderline(difference/2) + title + setStringUnderline(difference/2);
        System.out.println(titleStr);
        if (titleStr.length() > titleMaxLength) {
            titleMaxLength = titleStr.length();
        }
    }

    public static void title(String title, int maxLength) {
        int length = title.length();
        int difference = 0;
        if (length <= maxLength) {
            difference = maxLength - length;
        }
        String titleStr = setStringUnderline(difference/2) + title + setStringUnderline(difference/2);
        System.out.println(titleStr);
    }

    private static String setStringUnderline(int gap) {
        var underline = "";
        for (int i = 0; i <= gap; i++) {
            underline += "_";
        }
        return underline;
    }


}
