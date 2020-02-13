package com.codegym.Action;

import com.codegym.Model.Word;
import com.codegym.ReadWrite.Write.Write;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Remove {
    public static void remove(HashMap<String, Word> map) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu can xoa : ");
        String key = sc.nextLine();

        map.remove(key);
        System.out.println("Xoa tu " + key + " Success!");
        Write.write(map);
//        System.out.println();
//        System.out.println(map);
    }

//    public static class ListMap {
//        public static void listMap(HashMap<String ,Word>map){
//            System.out.println("Các entry có trong hashMap là: ");
//            map.forEach((keyInt, valueInt) -> System.out.println(
//                    keyInt + " = "  + valueInt));
//        }
//    }
}
