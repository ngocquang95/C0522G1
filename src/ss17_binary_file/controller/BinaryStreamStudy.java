package ss17_binary_file.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryStreamStudy {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> strings = new ArrayList<>();
        strings.add("Nguyễn Tấn HUân");
        strings.add("Thủy Tiên");

        // Write File
        FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_binary_file/data/data.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(strings);

        objectOutputStream.close();


        // Read File
        FileInputStream fileInputStream = new FileInputStream("src/ss17_binary_file/data/data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<String> stringsRead = (List<String>) objectInputStream.readObject();

        System.out.println(stringsRead);

        objectInputStream.close();
    }
}
