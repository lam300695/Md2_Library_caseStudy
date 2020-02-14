package com.codegym.Management;

import com.codegym.Action.Input;
import com.codegym.Model.Word;
import com.codegym.ReadWrite.Write.Write;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Impl implements Management {

    private String key;

    @Override
    public void addWord(HashMap<String, Word> map) {
        map.put(Input.inputKey(), new Word(Input.inputTranslate(), Input.inputDictionary(), Input.inputActive()));
        System.out.println("Add Success!!!");
        Write.write(map);
        System.out.println("------");
    }

    @Override
    public void repaintWord(HashMap<String, Word> map) {
        map.replace(Input.inputKey(), new Word(Input.inputTranslate(), Input.inputDictionary(), Input.inputActive()));
        System.out.println("Repair Success!!!");
        Write.write(map);
    }

    @Override
    public void removeWord(HashMap<String, Word> map) {
        map.remove(Input.inputKey());
        System.out.println("Remove Success!!!");
        Write.write(map);
    }

    @Override
    public void findWord(HashMap<String, Word> map) {
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
        System.out.println("Translate to " + find2 + " is : ");
        for (int i = 0; i < listOfKeys.size(); i++) {
            if (listOfKeys.get(i).equals(find2)) {
                System.out.println(listOfKeys.get(i) + " : " + listOfValues.get(i));
            }
        }
    }

    @Override
    public void printWord(HashMap<String, Word> map) {
        System.out.println("List : ");
        map.forEach((keyInt, valueInt) -> System.out.println(
                keyInt + " : "  + valueInt ));
    }
}
