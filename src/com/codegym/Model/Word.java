package com.codegym.Model;

public class Word {
    private String translate;
    private String describe;
    private String adjective;

    public Word() {
    }

    public Word(String translate, String params, String keyword) {
        this.translate = translate;
        this.describe = params;
        this.adjective = keyword;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getParams() {
        return describe;
    }

    public void setParams(String params) {
        this.describe = params;
    }

    public String getKeyword() {
        return adjective;
    }

    public void setKeyword(String keyword) {
        this.adjective = keyword;
    }

    @Override
    public String toString() {
        return
                 translate + "," +
                 describe + "," +
                 adjective  ;
    }
}

