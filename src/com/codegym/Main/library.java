package com.codegym.Main;

import com.codegym.Action.Add;
import com.codegym.Action.Find;
import com.codegym.Action.Remove;
import com.codegym.ReadWrite.Read.Read;

import javax.print.attribute.standard.Fidelity;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class library {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap();

        while (0 == 0) {
            int select = 0;

            System.out.println(" ");
            System.out.println("Ban muon lam gi : ");
            System.out.println("1.Them tu moi");
            System.out.println("2.Xoa tu");
            System.out.println("3.In Map");
            System.out.println("4.Tim kiem tu");
            System.out.println("5.Dung chuong trinh");
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
//                    Read.read();
                    System.out.println();
                    break;
                case 4:
                    Find.find(map);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
