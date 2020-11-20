package com.company;
/*Класс Language реализовывает методы createCompiler и возвращает новый экземпляр класса компилятора языка.
* Абстрактный класс Compiler нужен для наследования. Классы JavaCompiler, JavaScriptCompiler, PascalCompiler наследуются
* от Compiler и переопределяют метод compile.*/
public class Main {

    public static void main(String[] args) {
        Language language = new Language();
        Compiler compiler = language.createCompiler("Java");
        compiler.compile("code.java");
    }
}
