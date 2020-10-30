package lab.pkg1.pkg3;

import java.util.Scanner;

/* Главный класс, из которого происходит запуск программы
Создается экземплер класса Пользователи с атрибутами "Nikita" и "abc"
Вызывается метод pass*/
public class Lab13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Users user = new Users("Nikita", "abc");
        System.out.print("Введите пароль:");
        user.pass(scanner.next());
    }
}