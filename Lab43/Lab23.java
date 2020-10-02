package Lab43;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*Главный класс программы. f - файл для чтения*/
public class Lab23 {

    public static void main(String[] args) {
        String path = "C:\\Users\\plato\\OneDrive\\Desktop\\test.txt";
        String[][] b = transpose(path);
        for (String[] a : b){
            for(String c : a){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    public static String[][] transpose(String path){
        File f = new File(path);
        FileReader fr;
        BufferedReader bf;
        try{
            bf = new BufferedReader(new FileReader(f));
            String tmp = bf.readLine();
            int n = tmp.split(" ").length;
            int i = 0, j = 0;
            String[][] array = new String[n][n];
            //Пока рабочая строка tmp ненулевая заполняем матрицу
            while (tmp != null){
                for (String a : tmp.split(" ")){
                    array[i][j] = a;
                    j++;
                }
                i++;
                j = 0;
                tmp = bf.readLine();
            }
            //Транспонирование матрицы
            for (i = 0; i < n; i++){
                for (j = i; j < n; j++){
                    tmp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = tmp;
                }
            }
            return array;
        } catch (IOException e){
            e.printStackTrace();
        }
        String[][] b ={{""}};
        return b;
    }
}
