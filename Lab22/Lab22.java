package lab22;

import java.io.*;

/*Главный класс программы. f - файл для чтения. f1 - файл для записи*/
public class Lab22 {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\plato\\OneDrive\\Desktop\\task2.java");
        File f1 = new File("C:\\Users\\plato\\OneDrive\\Desktop\\task22.java");
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fr = new FileReader(f);
            fw = new FileWriter(f1);
            int b = 0;
            String tmp = "";
            //Cчитываем слово, записываем в tmp, если слово "public" - меняем на "private"
            while ((b = fr.read()) != -1) {
                if ((char) b == ' ') {
                    if (tmp.equals("public"))
                        fw.write("private ");
                    else
                        fw.write(tmp + " ");
                    tmp = "";
                } else if ((char) b == '\n') {
                    fw.write(tmp + '\n');
                    tmp = "";
                } else
                    tmp += (char) b;
            }
        } catch (IOException e) {
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
            }
        }
    }
}
