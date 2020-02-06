package com.codegym.Model;

public class Word {
    private String translate;
    private String params;
    private String keyword;

    public Word() {
    }

    public Word(String translate, String params, String keyword) {
        this.translate = translate;
        this.params = params;
        this.keyword = keyword;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "{" +
                "translate : '" + translate + '\'' +
                ", Dictionary : '" + params + '\'' +
                ", active : '" + keyword + '\'' +
                '}';
    }
}
