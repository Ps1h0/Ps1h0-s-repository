package lab.pkg1.pkg3;

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
