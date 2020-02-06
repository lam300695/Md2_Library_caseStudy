package com.codegym.Action;

import com.codegym.Model.Word;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Repair {
    public static void repair(HashMap<String, Word> map){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon tu can sua : ");
        String key = sc.nextLine();
        System.out.println("Input Translate : ");
        String a = sc.nextLine();
        System.out.println("Input Dictionary : ");
        String b = sc.nextLine();
        System.out.println("Input Active : ");
        String c = sc.nextLine();

        Set<Map.Entry<String, Word>> setMap = map.entrySet();
        System.out.println(setMap);
        map.replace(key, new Word(a, b, c));
    }
}
