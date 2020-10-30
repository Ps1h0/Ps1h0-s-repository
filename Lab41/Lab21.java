package Lab41;

import java.util.Scanner;

public class Lab21 {

    public static void main(String[] args) {
        //Рабочий массив
        String[] arr = input();
        String ans = search(arr);
        System.out.println(ans);
    }

    public static String[] input() {
        Scanner scan = new Scanner(System.in);
        String[] a = scan.nextLine().split(" ");
        return a;
    }

    public static String search(String[] a) {
        String ans = "";
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].charAt(a[i].length() - 1) == a[i + 1].charAt(0)) {
                ans += a[i] + " " + a[i + 1] + " ";
            }
        }
        return ans.trim();
    }
}
