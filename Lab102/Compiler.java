package com.company;

public abstract class Compiler {
    public abstract void compile(String s);

    public abstract String lexemTable(String s);

    public abstract String identifTable(String s);

    public abstract String triad(String s );

    public abstract String objectCode(String s);

    public abstract void loadCode();
}
