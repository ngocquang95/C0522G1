package ss4_oop;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static final String NAME = "HELLO";

    void calculate(int a, int b) {

    }

    void calculate(double a, int b) {

    }

    int calculate(double a, double b) {
        return 0;
    }

    public static void main(String[] args) {
        String str = null;
        // Cách thiếu nhi
        if (str != null) {
            System.out.println(str.equals("ABC"));
        }
        // Cách người từng trải
        System.out.println(Demo.NAME.equals(str));

        // Nhập vào một mảng học sinh => xuất ra kết quả
        Student[] students = new Student[2];
        Scanner scanner = new Scanner(System.in);
        // Nhập thông tin
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();// cấp phát bộ nhớ
            System.out.printf("======= Nhập vào thông tin sinh viên %d =======", i + 1);

            System.out.print("Nhập vào tên: ");
            students[i].name = scanner.nextLine();

            System.out.print("Nhập vào tuổi: ");
            students[i].age = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập vào màu sắc: ");
            students[i].color = scanner.nextLine();
        }

        // Xuất thông tin
//        for (int i = 0; i < students.length; i++) {
//            System.out.printf("======= Thông tin sinh viên %d =======", i + 1);
//            System.out.println(students[i]);
//        }

        System.out.println(Arrays.toString(students));

//        Student student = new Student("abc");
//
//        System.out.println("Name: " + student.name);
//        System.out.println("Age: " + student.age);
//        System.out.println("Color: " + student.color);
    }
}
