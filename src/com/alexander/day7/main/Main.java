package com.alexander.day7.main;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - eng, 2 - by; else - ru");
        String language = "";
        String country = "";
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        switch (input) {
            case 1:
                language = "en";
                country = "US";
                break;
            case 2:
                language = "by";
                country = "BY";
                break;
        }
        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("datares.text", locale);
        String str1 = rb.getString("str1");
        String str2 = rb.getString("str2");
        System.out.println(str1);
        System.out.println(str2);
    }
}
