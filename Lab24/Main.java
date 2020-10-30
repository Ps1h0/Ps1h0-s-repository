package com.company;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Главный класс программы. f - файл для чтений, f1 - файл для записи, pattern - шаблон для поиска.*/
public class Main {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\plato\\OneDrive\\Desktop\\test.txt");
        File f1 = new File("C:\\Users\\plato\\OneDrive\\Desktop\\test1.txt");
        BufferedReader bf;
        FileWriter fw = null;
        String pattern = "np\\s[a-z]";

        //Создание экземпляра класса Pattern
        Pattern r = Pattern.compile(pattern);

        try {
            bf = new BufferedReader(new FileReader(f));
            fw = new FileWriter(f1);
            String tmp;
            //Пока в файле есть ненулевые строки выполняем поиск по шаблону
            while ((tmp = bf.readLine()) != null) {
                //Создание экземпляра класса Matcher
                Matcher m = r.matcher(tmp);
                if (m.find()) {
                    fw.write(m.group());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
