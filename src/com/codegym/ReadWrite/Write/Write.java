package com.codegym.ReadWrite.Write;

import com.codegym.Model.Word;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Write {
    public static void write(HashMap<String, Word> map){
        try {
            File f = new File("/home/lam/data3.txt");
            FileWriter fw = new FileWriter(f);
            map.forEach((keyInt, valueInt) -> {
                try {
                    fw.write(keyInt  + " : " + valueInt + "\r\n" );
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            fw.close();
        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e);
        }
    }
}
