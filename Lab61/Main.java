package Lab61;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Subject subject1 = new Subject("Math", "101", 1);
        System.out.println("Созданный объект: " + subject1);
        String file = "res.txt";
        Serializator sz = new Serializator();
        boolean b = sz.serialization(subject1, file);
        Subject res = null;
        try{
            res = sz.deserialization(file);
        } catch (InvalidObjectException e){
            e.printStackTrace();
        }
        System.out.println("Объект полученный из файла с помощью десериализации: " + res);

        String fileName = "Subjects.xml";
        List<Subject> subjectsList = parseXMLfile(fileName);
        Serializator serializator = new Serializator();
        //Запись объектов в файл
        for (int i = 0; i < subjectsList.size(); i++){
            serializator.serialization(subjectsList.get(i),"res.txt");
        }
    }
    //Метод, производящий парсинг XML документа в лист
    private static List<Subject> parseXMLfile(String fileName){
        List<Subject> subjectsList = new ArrayList<>();
        Subject subject = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            // инициализируем reader и скармливаем ему xml файл
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
            // проходим по всем элементам xml файла
            while (reader.hasNext()) {
                // получаем событие (элемент) и разбираем его по атрибутам
                XMLEvent xmlEvent = reader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("subject")) {
                        subject = new Subject("", "", 0);
                        // Получаем атрибут id для каждого элемента subject
                        Attribute idAttr = startElement.getAttributeByName(new QName("id"));
                        if (idAttr != null) {
                            subject.setId(Integer.parseInt(idAttr.getValue()));
                        }
                    } else if (startElement.getName().getLocalPart().equals("name")) {
                        xmlEvent = reader.nextEvent();
                        subject.setName(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("classroom")) {
                        xmlEvent = reader.nextEvent();
                        subject.setClassroom(xmlEvent.asCharacters().getData());
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("subject")) {
                        subjectsList.add(subject);
                    }
                }
            }
        } catch (XMLStreamException | FileNotFoundException exc) {
            exc.printStackTrace();
        }
        return subjectsList;
    }
}
