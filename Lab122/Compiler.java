package com.company;

public abstract class Compiler {
    private String name;
    private String code;

    public void setCode(String code){
        this.code = code;
    }

    public void compile(){
        lexemTable();
        identifTable();
        triad();
        objectCode();

    }

    public abstract void lexemTable();

    public abstract void identifTable();

    public abstract void triad();

    public abstract void objectCode();
}
