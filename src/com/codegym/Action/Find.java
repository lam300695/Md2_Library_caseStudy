package com.codegym.Action;

import com.codegym.Model.Word;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find {
    public static void find(HashMap<String, Word> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu can tim kiem : ");
        String find = sc.nextLine();

        Set<String> keys = map.keySet();
        List<String> listOfKeys = new ArrayList<String>(keys);

        Collection<Word> values = map.values();
        List<Word> listOfValues = new ArrayList<Word>(values);

        String regex = ".*" + find + ".*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (int i = 0; i < listOfKeys.size(); i++) {
            matcher = pattern.matcher(listOfKeys.get(i));
            if (matcher.find()) {
                System.out.println(listOfKeys.get(i));
            }
        }
        System.out.println("Ban muon tim tu nao : ");
        String find2 = sc.nextLine();
        for (int i = 0; i < listOfKeys.size(); i++) {
            if (listOfKeys.get(i).equals(find2)) {
                System.out.println(listOfKeys.get(i) + " : " + listOfValues.get(i));
            }
        }
    }
}
