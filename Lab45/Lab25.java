package Lab45;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Главный класс программы. Пользователем вводится строка. pattern - шаблон для поиска
 * numbers - рабочая строка для поиска самого длинного числа*/
public class Lab25 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(nums(str));
    }

    public static String nums(String a) {
        String pattern = "\\d+";
        String numbers = "";

        //Создание экземпляра класса Pattern
        Pattern r = Pattern.compile(pattern);

        //Создание экземпляра класса Matcher
        Matcher m = r.matcher(a);

        /*Пока в строке str встречается подстрока, соответствующая шаблону pattern
        Сравниваем длину и ищем максимальную, которую записываем в numbers*/
        while (m.find()) {
            if (a.substring(m.start(), m.end()).length() > numbers.length()) {
                numbers = a.substring(m.start(), m.end());
            }
        }
        return numbers;
    }
}
