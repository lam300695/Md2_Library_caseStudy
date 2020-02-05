package com.codegym.ReadWrite.Read;

import java.io.*;
import java.util.HashMap;

public class Read {
    public static void read() throws IOException {
        try {
            File f = new File("/home/lam/data3.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Loi doc file: "+e);
        }
    }
}
