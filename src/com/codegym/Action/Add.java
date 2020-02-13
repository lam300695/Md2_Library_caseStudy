package com.codegym.Action;

import com.codegym.Model.Word;
import com.codegym.ReadWrite.Read.Read;
import com.codegym.ReadWrite.Write.Write;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Add {
    public static void put(HashMap<String, Word> map) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Them tu : ");
        String key = sc.nextLine();
        System.out.println("Input Translate : ");
        String a = sc.nextLine();
        System.out.println("Input Dictionary : ");
        String b = sc.nextLine();
        System.out.println("Input Active : ");
        String c = sc.nextLine();

        map.put(key, new Word(a, b, c));
        System.out.println("Them tu " + key + " Success!");
        Write.write(map);
        System.out.println();
//        System.out.println("Các entry có trong hashMap là: ");
//        map.forEach((keyInt, valueInt) -> System.out.println(
//                keyInt + " : "  + valueInt));
    }
}
