import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subject", propOrder = {
        "id",
        "name",
        "classroom"
})
public class Subject{
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    private String name;
    @XmlElement(required = true)
    private String classroom;
    @XmlElement(required = true)
    private int id;
    public Subject() { }
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
