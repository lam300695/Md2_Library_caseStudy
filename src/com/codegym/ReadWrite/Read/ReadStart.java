package com.codegym.ReadWrite.Read;

import com.codegym.Model.Word;

import java.io.*;
import java.util.HashMap;

public class ReadStart {
    public static void readStart(HashMap<String , Word>map){
        try {
            File f = new File("/home/lam/data3.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] word = line.split(" : ");
                String key = word[0];
                String [] word1 = word[1].split(",");
                Word w1 = new Word(word1[0], word1[1], word1[2]);
                map.put(key, w1);
//                System.out.println(map);
//                System.out.println(line);
            }
//            System.out.println("List word : ");
//            map.forEach((keyInt, valueInt) -> System.out.printf(
//                    keyInt + " : "  + valueInt + "\r\n" ));
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Loi doc file: " + e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
