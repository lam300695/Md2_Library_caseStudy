package com.codegym.Action;

import com.codegym.Model.Word;
import com.codegym.ReadWrite.Read.Read;
import com.codegym.ReadWrite.Write.Write;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Add {
    public static void put(HashMap<String, Word> map) throws IOException {
        String a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Key : ");
        String key = sc.nextLine();
        System.out.println("Input Translate : ");
        a = sc.nextLine();
        System.out.println("Input Dictionary : ");
        b = sc.nextLine();
        System.out.println("Input Active : ");
        c = sc.nextLine();

        map.put(key, new Word(a, b, c));
        System.out.println("Them tu " + key + " Success!");
        Write.write(map);
        System.out.println();
        System.out.println(map);
    }
}
