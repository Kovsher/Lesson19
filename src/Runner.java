import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    private static void writePersonsToJson(List<Person> persons) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {

            writer.writeValue(new File("persons.json"), persons);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

//    public static Person readPersonFromFile(String FileName) {
//        Person p = null;
//        try (FileInputStream Fis = new FileInputStream(FileName);
//             ObjectInputStream oin = new ObjectInputStream(Fis)) {
//            p = (Person) oin.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return p;
//    }

//    public static void writePersonToFile(Person person, String FileName) {
//        try (FileOutputStream Fos = new FileOutputStream(FileName);
//             ObjectOutputStream oos = new ObjectOutputStream(Fos)) {
//            oos.writeObject(person);
//        } catch (IOException e) {
//            System.out.println(e.getStackTrace());
//        }
//    }

    public static void main(String[] args) {
//        Person ivan = new Person("Ivan", "Petrov", 25, true);
//        String FileName = "ivan.txt";
//        writePersonToFile(ivan, FileName);
//        Person personFromFile = readPersonFromFile(FileName);
//        System.out.println(personFromFile);

        Person p = new Person("Ivan", "Petrov", 34, true);
        Person tom = new Person("Tom", "Johns", 40, false);
        List<Person> personList = new ArrayList<>();
        personList.add(tom);
        personList.add(p);
        writePersonsToJson(personList);

    }
}

//        Person tom = new Person("Tom", "Johns", 40, false);
//        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("tom.txt"))) { //DOS
//            dos.writeUTF(tom.getFirstName());//UTF a8 - in google
//            dos.writeUTF(tom.getLastName());
//            dos.writeInt(tom.getAge());
//            dos.writeBoolean(tom.isStudent());
//            System.out.println("File has been written");
//        } catch (IOException ex) {
//            System.out.println(ex.getStackTrace());
//        }
//        try (DataInputStream dis = new DataInputStream(new FileInputStream("tom.txt"))) {  //DIS
//            String name = dis.readUTF();
//            String lastname = dis.readUTF();
//            int age = dis.readInt();
//            boolean isStudent = dis.readBoolean();
//            Person person = new Person(name, lastname, age, isStude