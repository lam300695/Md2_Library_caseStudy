package com.codegym.Action;

import com.codegym.ReadWrite.Read.Read;
import com.codegym.ReadWrite.Write.Write;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Add {
    public static void put(HashMap<String,String>map) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Key : ");
        String key = sc.nextLine();
        System.out.println("Input Value : ");
        String value = sc.nextLine();

        map.put(key,value);
        System.out.println("Them tu " + key + " Success!");
        Write.write(map);
        System.out.println();
        System.out.println(map);
    }
}
