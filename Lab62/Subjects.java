import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

@XmlRootElement
public class Subjects{
    @XmlElement(name = "subject")
    private ArrayList<Subject> list = new ArrayList<Subject>();

    public Subjects(){
        super();
    }
    public void setList(ArrayList<Subject> list){
        this.list = list;
    }
    public boolean add(Subject sub){
        return list.add(sub);
    }
    @Override
    public String toString(){
        return "Subjects [list = "+list+"]";
    }
}