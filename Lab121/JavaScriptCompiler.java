package com.company;

public class JavaScriptCompiler extends Compiler{

    private String name = "JavaScriptCompiler";

    @Override
    public void getObjectCode() {
        System.out.println("I'm " + this.name + ", I've done object code");
    }
}

