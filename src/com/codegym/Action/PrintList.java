package com.codegym.Action;

import com.codegym.Model.Word;

import java.util.HashMap;

public class PrintList {
    public static void printList(HashMap<String, Word> map) {
        System.out.println("List : ");
        map.forEach((keyInt, valueInt) -> System.out.println(
                keyInt + " : "  + valueInt ));
    }
}
