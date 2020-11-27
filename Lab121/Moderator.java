package com.company;

public class Moderator {
    private String name = null;
    Compiler compiler = null;

    public void setLanguage(String name){
        this.name = name;
    }

    public void createCompiler(){
        switch (this.name) {
            case "Java":
                this.compiler = new JavaCompiler();
            case "JavaScript":
                this.compiler = new JavaScriptCompiler();
            case "Pascal":
                this.compiler = new PascalCompiler();
        }
    }
    public void compile(String filePath){
        this.compiler.getObjectCode();
    }
}
