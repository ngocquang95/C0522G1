package ss19_solid._1_responsibility_principle.correct;

import ss16_io_text.model.Student;
import ss16_io_text.utils.ReadFileUtil;
import ss16_io_text.utils.WriteFileUtil;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private static final String PATH = "src/ss16_io_text/student.txt";

    public static void add() throws IOException {
        // Phải đọc dữ liệu từ file
        List<Student> students = ReadFileUtil.readStudentFile(PATH);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào name: ");
        String name = scanner.nextLine();

        System.out.print("Nhập vào score: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student s = new Student(id, name, score);
        students.add(s);

        // Phải add xuống lại file
        WriteFileUtil.writeStudentFile(PATH, students);
    }
}