package Lab42;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Главный класс программы. f - файл для чтения. f1 - файл для записи*/
public class Lab22 {

    public static void main(String[] args) {
        String path1 = "C:\\Users\\plato\\OneDrive\\Desktop\\task2.java";
        publicToPrivate(path1);
    }
    public static String publicToPrivate(String path1){
        String path2 = "C:\\Users\\plato\\OneDrive\\Desktop\\task22.java";
        File f = new File(path1);
        File f1 = new File(path2);
        FileWriter fw = null;
        FileReader fr = null;
        try{
            fr = new FileReader(f);
            fw = new FileWriter(f1);
            int b = 0;
            String tmp = "";
            //Cчитываем слово, записываем в tmp, если слово "public" - меняем на "private"
            while ((b = fr.read()) !=-1){
                if((char) b == ' '){
                    if (tmp.equals("public"))
                        fw.write("private ");
                    else
                        fw.write(tmp + " ");
                    tmp = "";
                }else if ((char) b == '\n'){
                    fw.write(tmp + '\n');
                    tmp = "";
                } else
                    tmp += (char) b;
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally{
            try{
                if (fw != null){
                    fw.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return path2;
    }
}
