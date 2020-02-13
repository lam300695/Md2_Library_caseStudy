package com.codegym.Management;

import com.codegym.Model.Word;

import java.util.HashMap;

public class Impl implements Management {

    private String key;

    @Override
    public void addWord(HashMap<String, Word> map) {
        map.put(key,new Word());
    }

    @Override
    public void repaintWord(HashMap<String, Word> map) {
        map.replace(key,new Word());
    }

    @Override
    public void removeWord(HashMap<String, Word> map) {
        map.remove(key);
    }
}
