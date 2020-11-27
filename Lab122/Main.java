package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Moderator moderator = new Moderator();
        System.out.println("Язык: ");
        moderator.setLanguage(scanner.nextLine());
        moderator.createCompiler();
        moderator.compile("Путь");
    }
}
