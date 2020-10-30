import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Lab62 {
    public static void main(String[] args) {
        System.out.println("Маршаллизация");
        marshalling();
        System.out.println("Демаршаллизация");
        unmarshalling();
    }
    public static void marshalling(){
        try{
            JAXBContext context = JAXBContext.newInstance();
            Marshaller m = context.createMarshaller();
            Subjects sub = new Subjects(){
                {
                    Subject s = new Subject("Math", "101", 1);
                    this.add(s);
                    s = new Subject("Music", "102", 2);
                    this.add(s);
                }
            };
            m.marshal(sub, new FileOutputStream("subs.xml"));
            m.marshal(sub, System.out);
            System.out.println("XML-файл создан");
        } catch (FileNotFoundException e){
            System.out.println("XML-файл не может быть создан" + e);
        } catch (JAXBException e){
            System.out.println("JAXB-контекст ошибочен" + e);
        }
    }
    public static void unmarshalling(){
        try{
            JAXBContext jc = JAXBContext.newInstance(Subjects.class);
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader("Subjects.xml");
            Subjects subjects = (Subjects) u.unmarshal(reader);
            System.out.println(subjects);
        } catch (JAXBException e ){
            e.printStackTrace();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
