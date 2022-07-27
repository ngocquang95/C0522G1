package ss19_solid._1_responsibility_principle.wrong;

import ss16_io_text.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    public void add() throws IOException {
        // Đọc file
        File file = new File("src/ss16_io_text/student.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] info;
//        Student student;
        List<Student> students = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            students.add(new Student(Integer.parseInt(info[0]), info[1], Double.parseDouble(info[2])));
        }
        bufferedReader.close();


        System.out.println("Thông tin của students");
        System.out.println(students);


        // Cho người dùng nhập vào 1 student
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào name: ");
        String name = scanner.nextLine();

        System.out.print("Nhập vào score: ");
        double score = Double.parseDouble(scanner.nextLine());

        students.add(new Student(id, name, score));


        // Ghi file
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Student student : students) {
            bufferedWriter.write(student.getInfo());
        }

        bufferedWriter.close();
    }
}