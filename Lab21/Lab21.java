import java.util.Scanner;
/*Главный класс программы. Пользователь вводит строку.*/
public class Lab21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Рабочий массив
        String[] arr = scan.nextLine().split(" ");
        //Сравниваем в цикле последний символ слова с первым символом следующего.
        //Если символы совпадают, выводим эти 2 слова
        for (int i = 0; i < arr.length-1; i++){
            if(arr[i].charAt(arr[i].length()-1) == arr[i+1].charAt(0)){
                System.out.println(arr[i] + " " + arr[i+1]);
            }
        }
    }
}
