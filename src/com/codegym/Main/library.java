package com.codegym.Main;

import com.codegym.Action.*;
import com.codegym.Model.Word;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class library {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Word> map = new HashMap();

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
            System.out.println("List word : ");
            map.forEach((keyInt, valueInt) -> System.out.printf(
                    keyInt + " : "  + valueInt + "\r\n" ));
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Loi doc file: " + e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            while (0 == 0) {
                int select = 0;

                System.out.println(" ");
                System.out.println("what do you want to do ??? ");
                System.out.println("1.Add new");
                System.out.println("2.Remove");
                System.out.println("3.Repair");
                System.out.println("4.Print List");
                System.out.println("5.Find");
                System.out.println("6.Stop Program");
                System.out.println("Input Select : ");
                select = sc.nextInt();
                switch (select) {
                    case 1:
                        Add.put(map);
                        break;
                    case 2:
                        Remove.remove(map);
                        break;
                    case 3:
                        Repair.repair(map);
                        break;
                    case 4:
                        PrintList.printList(map);
                        break;
                    case 5:
                        Find.find(map);
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Select: 1,2,3,4,5,6");
                }
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
