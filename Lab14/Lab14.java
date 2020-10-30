package lab1.pkg4;

import java.util.Scanner;

/*Главный класс, из которого происходит запуск программы
Пользователь вводит строку и делит ее по пробелу.
Эта строка переводится в массив чисел. Создается экземпляр класса Numbers.*/
public class Lab14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] a = scan.nextLine().split(" ");
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = Integer.parseInt(a[i]);
        }
        Numbers num = new Numbers(c);
        System.out.println(num.summ());
    }
}
