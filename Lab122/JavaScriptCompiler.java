package com.company;

public class JavaScriptCompiler extends Compiler{

    String code;
    String name = "JavaScriptCompiler";

    @Override
    public void lexemTable() {
        System.out.println("I'm " + this.name + ", I've done lexeme table");
    }

    @Override
    public void identifTable() {
        System.out.println("I'm " + this.name + ", I've done identifier table");
    }

    @Override
    public void triad() {
        System.out.println("I'm " + this.name + ", I've done triad table");
    }

    @Override
    public void objectCode() {
        System.out.println("I'm " + this.name + ", I've done object code");
    }
}
