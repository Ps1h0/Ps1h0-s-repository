package com.company;

import java.util.Scanner;

/*Класс Language реализовывает методы createCompiler и возвращает новый экземпляр класса компилятора языка.
* Абстрактный класс Compiler нужен для наследования. Классы JavaCompiler, JavaScriptCompiler, PascalCompiler наследуются
* от Compiler и переопределяют метод compile.*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Language language = new Language();
        System.out.println("Что хотите выполнить?\n" +
                "1. Выбор языка\n" +
                "2. Ввод кода\n" +
                "3. Вывести таблицу лексем\n" +
                "4. Вывести триады\n" +
                "5. Вывести объектный код\n" +
                "0. Выход");
        int exe = scanner.nextInt();
        Compiler compiler = null;
        if (exe == 1)
            compiler = language.createCompiler(scanner.nextLine());
        else if (exe == 2)
            compiler.loadCode();
        .........................
    }
}
