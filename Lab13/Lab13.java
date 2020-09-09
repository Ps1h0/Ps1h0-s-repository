package lab.pkg1.pkg3;

import java.util.Scanner;

public class Lab13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Users user = new Users("Nikita", "abc");
        System.out.print("Введите пароль:");
        user.pass(scanner.next());
    }
}