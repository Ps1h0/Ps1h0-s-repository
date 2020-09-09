package lab.pkg1.pkg3;
/*Класс Пользователи с атрибутами логин и пароль
метод pass сравнивает введенный пароль с образцом
Если пароль совпадает с образцом выводится сообщение "Вход выполнен",
иначе сообщение "Вход не выполнен"*/
public class Users {
    private String login;
    private String password;
    
    public Users(String login, String password){
        this.login = login;
        this.password = password;
    }
    
    void pass(String password){
        if (this.password.equals(password))
            System.out.println("Вход выполнен");
        else
            System.out.println("Вход не выполнен");
    }
}
