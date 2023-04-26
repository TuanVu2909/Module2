package Date25_04.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person(1, "Vũ");
        People people = new People(2, "đức", 2345);
        //Ghi file
        File file = new File("D:\\CodeGym\\Modue2\\Module2C0223i1\\src\\Date25_04\\Person\\Person.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
//        FileOutputStream fileOutputStream  = new FileOutputStream(file);
//        ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream);
//        objOutputStream.writeObject(person);
//        objOutputStream.writeObject(people);
//
//        objOutputStream.close();
//        fileOutputStream.close();
        // Đọc file
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 = (Person) objectInputStream.readObject();
        People people1 = (People) objectInputStream.readObject();
        System.out.println(person1);
        System.out.println(people1);

        objectInputStream.close();
        fileInputStream.close();


    }

}
