package com.company;

public class Moderator {

    private String name = null;
    private Compiler compiler = null;

    public void setLanguage(String name){
        this.name = name;
    }
    public void createCompiler(){
        switch (this.name) {
            case "Java":
                this.compiler = new JavaCompiler();
                this.compiler.setCode("");
            case "JavaScript":
                this.compiler = new JavaScriptCompiler();
                this.compiler.setCode("");
            case "Pascal":
                this.compiler = new PascalCompiler();
                this.compiler.setCode("");
        }
    }
    public void compile(String filePath){
        this.compiler.compile();
    }
}
