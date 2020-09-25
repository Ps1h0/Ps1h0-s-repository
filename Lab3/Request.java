package Lab3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

/*Класс запросов.*/
public class Request {
    private final Statement statement;
    //Конструктор класса Request
    Request(Statement statement){
        this.statement = statement;
    }
    /*Первое задание: вывести информацию о преподавателях, работающих в заданный день
    в заданной аудитории*/
    public void workingTeacher(String day, String classroom) throws SQLException {
        //SQL запрос, считывающий всю таблицу расписание
        String sql = "SELECT * FROM schedule";
        ResultSet res = this.statement.executeQuery(sql);
        //Массив идентификаторов преподавателей
        ArrayList<String> teachers = new ArrayList<>();
        /*Получаем из таблицы данные о днях и аудиториях и сравниваем их с заданными значениями
        Если true, записываем в массив преподавателей идентификатор преподавателя*/
        while (res.next()){
            if(res.getString("Day").equals(day) && res.getString("classroom").equals(classroom)){
                teachers.add(res.getString("Teacher"));
            }
        }
        //SQL запрос, считывающий таблицу преподавателей
        String sql2 = "SELECT * FROM teachers";
        res = this.statement.executeQuery(sql2);
        /*Сравниваем идентификаторы в таблице с идентификаторами в массиве.
        *При совпадении выводим информацию о преподавателе (ФИО).*/
        while(res.next()){
            for (String i : teachers)
                if(res.getString("ID").equals(i)){
                    System.out.println("\n==================\n");
                    System.out.println("Surname: " + res.getString("Surname"));
                    System.out.println("Name: " + res.getString("Name"));
                    System.out.println("Patronymic: " + res.getString("Patronymic"));
                }
        }
    }
    //Второе задание: вывести информацию о преподавателях, которые НЕ ведут занятия в заданный день недели
    public void notWorkingTeacher(String day) throws SQLException {
        //SQL запрос, считывающий всю таблицу расписание
        String sql = "SELECT * FROM schedule";
        ResultSet res = this.statement.executeQuery(sql);
        //Массив идентификаторов преподавателей
        ArrayList<String> teachers = new ArrayList<>();
        /*Получаем из таблицы данные о днях и сравниваем с заданным значением
        * Если true, записываем в массив преподавателей идентификатор преподавателя*/
        while (res.next()){
            if(!res.getString("Day").equals(day)){
                teachers.add(res.getString("Teacher"));
            }
        }
        //SQL запрос, считывающий таблицу преподавателей
        String sql2 = "SELECT * FROM teachers";
        res = this.statement.executeQuery(sql2);
        /*Сравниваем идентификаторы в таблице с идентификаторами в массиве
        * При совпадении выводим информацию о преподавателе (ФИО).*/
        while(res.next()){
            for (String i : teachers)
                if(res.getString("ID").equals(i)){
                    System.out.println("\n==================\n");
                    System.out.println("Surname: " + res.getString("Surname"));
                    System.out.println("Name: " + res.getString("Name"));
                    System.out.println("Patronymic: " + res.getString("Patronymic"));
                }
        }
    }
    //Третье задание: вывести дни недели, в которые проводится данное кол-во занятий
    public void numOfLessons(int a) throws SQLException {
        //SQL запрос, считывающий всю таблицу расписание
        String sql = "SELECT * FROM schedule";
        ResultSet res = this.statement.executeQuery(sql);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        ArrayList<String> arr = new ArrayList<>();
        int count = 0;
        //Добавляем в массив дни из таблицы расписание
        while (res.next()){
            arr.add(res.getString("Day"));
        }
        /*Подсчитываем сколько раз в массиве встречается каждый день и сравниваем с заданным числом
        * Если true, выводим нужный день*/
        for (String day : days) {
            count = Collections.frequency(arr, day);
            if (count == a) {
                System.out.println(day);
            }
        }
    }
    //Четвертое задание: вывести дни недели, в которые занято заданное кол-во аудиторий
    public void numOfClassrooms(int a) throws SQLException{
        //SQL запрос, выбирающий день и считающий кол-во занятых аудиторий в этот день
        String sql = "SELECT day, COUNT(classroom) as count FROM schedule GROUP BY day";
        ResultSet res = this.statement.executeQuery(sql);
        //Если кол-во занятых аудиторий совпадает с заданным значением, выводим этот день
        while (res.next()){
            if (res.getInt("count") == a){
                System.out.println(res.getString("Day"));
            }
        }
    }
    //Пятое задание: перенести первые занятия заданных дней на последнее место
    public void replaceTable(String day) throws SQLException{
        //SQL запрос, удаляющий из таблицы расписание все строки с указанным днем
        String sql = "DELETE FROM schedule WHERE ID IN (SELECT MIN(ID) FROM schedule WHERE Day = '"+day+"')";
        //ResultSet res = this.statement.executeQuery(sql);
        String sql1 = "SELECT * FROM schedule WHERE ID IN (SELECT MIN(ID) FROM schedule WHERE Day = '"+day+"')";
        ResultSet res = this.statement.executeQuery(sql1);
        ArrayList<String> subs = new ArrayList<>();
        if (res.first()){
            subs.add(String.valueOf(res.getInt("Teacher")));
            subs.add(String.valueOf(res.getInt("Subject")));
            subs.add(res.getString("Day"));
            subs.add(String.valueOf(res.getInt("classroom")));
            subs.add(String.valueOf(res.getInt("Quantity")));
        }
        this.statement.executeUpdate(sql);
        String sql2 = "INSERT INTO schedule (Teacher, Subject, Day, classroom, Quantity) value ("
                + Integer.parseInt(subs.get(0)) + ","
                + Integer.parseInt(subs.get(1)) + ",'"
                + subs.get(2) + "',"
                + Integer.parseInt(subs.get(3)) + ","
                + Integer.parseInt(subs.get(4)) + ")";
    }
}
