package com.company;

public class JavaCompiler extends Compiler{

    private String name = "JavaCompiler";

    @Override
    public void getObjectCode() {
        System.out.println("I'm " + this.name + ", I've done object code");
    }
}
