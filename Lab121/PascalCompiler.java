package com.company;

public class PascalCompiler extends Compiler{

    private String name = "PascalCompiler";

    @Override
    public void getObjectCode() {
        System.out.println("I'm " + this.name + ", I've done object code");
    }
}
