package ss17_binary_file.controller;

import ss17_binary_file.model.Person;
import ss17_binary_file.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryStreamStudy2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Tấn Huân", 1.5));
        students.add(new Student(1, "Thủy Tiên", 5));

        // Write File
        FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_binary_file/data/data.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(new Student(1, "Nguyễn Tấn Huân", 1.5));
        objectOutputStream.close();


        Person.name = "abc";

        // Read File
        FileInputStream fileInputStream = new FileInputStream("src/ss17_binary_file/data/data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object obj = objectInputStream.readObject();
        Student list = (Student) objectInputStream.readObject();
        System.out.println(list);


//        while (true) {
//            try {
//                System.out.println((Person) objectInputStream.readObject());
//            } catch (EOFException | StreamCorruptedException e) {
//                break;
//            }
//
//        }
        objectInputStream.close();
    }
}
