package com.company;

//Класс создатель+инф.эксперт
public class Language {
    public Compiler createCompiler(String lan){
        switch (lan) {
            case "Java":
                return createJavaCompiler();
            case "JavaScript":
                return createJSCompiler();
            case "Pascal":
                return createPascalCompiler();
            default:
                return null;
        }
    }
    public JavaCompiler createJavaCompiler(){
        //Создание объекта Java компилятора
        return new JavaCompiler();
    }

    public JavaScriptCompiler createJSCompiler(){
        //Создание объекта JS компилятора
        return new JavaScriptCompiler();
    }

    public PascalCompiler createPascalCompiler(){
        //Создание объекта Pascal компилятора
        return new PascalCompiler();
    }
}
