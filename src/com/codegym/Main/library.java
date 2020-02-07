package com.codegym.Main;

import com.codegym.Action.Add;
import com.codegym.Action.Find;
import com.codegym.Action.Remove;
import com.codegym.Action.Repair;
import com.codegym.Model.Word;

import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class library {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Word> map = new HashMap();

        try {
            while (0 == 0) {
                int select = 0;

                System.out.println(" ");
                System.out.println("Ban muon lam gi : ");
                System.out.println("1.Them moi");
                System.out.println("2.Xoa");
                System.out.println("3.Sua");
                System.out.println("4.In Map");
                System.out.println("5.Tim kiem");
                System.out.println("6.Dung chuong trinh");
                System.out.println("Nhap lua chon : ");
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
                        System.out.println(map);
                        break;
                    case 5:
                        Find.find(map);
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Moi chon 1,2,3,4,5,6");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("nhap sai" + e);
        }
    }
}
