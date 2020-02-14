package com.codegym.Action;

import java.util.Scanner;

public class Input {
    public static String inputKey() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Word : ");
        String key = sc.nextLine();
        return key;
    }

    public static String inputTranslate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Translate : ");
        String a = sc.nextLine();
        return a;
    }

    public static String inputDictionary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Dictionary : ");
        String b = sc.nextLine();
        return b;
    }

    public static String inputActive() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Active : ");
        String c = sc.nextLine();
        return c;
    }
}
