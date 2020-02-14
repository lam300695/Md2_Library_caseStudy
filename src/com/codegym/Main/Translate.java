package com.codegym.Main;

import com.codegym.Action.*;
import com.codegym.Model.Word;
import com.codegym.ReadWrite.Read.ReadStart;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Translate {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Word> map = new HashMap();
        ReadStart.readStart(map);
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
                        Add add = new Add();
                        add.addWord(map);
                        break;
                    case 2:
                        Remove remove = new Remove();
                        remove.removeWord(map);
                        break;
                    case 3:
                        Repair repair = new Repair();
                        repair.repaintWord(map);
                        break;
                    case 4:
                        PrintList printList = new PrintList();
                        printList.printWord(map);
                        break;
                    case 5:
                       Find find = new Find();
                       find.findWord(map);
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
