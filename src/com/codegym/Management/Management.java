package com.codegym.Management;

import com.codegym.Model.Word;

import java.util.HashMap;

public interface Management {
    void addWord(HashMap<String , Word>map);
    void repaintWord(HashMap<String , Word>map);
    void removeWord(HashMap<String , Word>map);
}
