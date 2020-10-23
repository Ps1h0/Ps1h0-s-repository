package Lab61;

import java.io.Serializable;

public class Subject implements Serializable {
    private String name;
    private String classroom;
    private int id;

    public Subject(String name, String classroom, int id){
        this.name = name;
        this.classroom = classroom;
        this.id = id;
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getClassroom (){
        return classroom;
    }

    public void setClassroom (String classroom){
        this.classroom = classroom;
    }

    public int getId (){
        return id;
    }

    public void setId (int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return "Subject [name = "+name+", classroom = "+classroom+", id = "+id+"]";
    }
}
