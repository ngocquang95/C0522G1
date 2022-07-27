package baobao.controller;

import baobao.model.Student;
import baobao.sort.ComparatorScore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareStudy {
    // Sắp xếp theo tên tăng dần => sử dụng cách nào cũng được
//    Comparable => compareTo
    //Comparator => compare

    public static void main(String[] args) {
//        System.out.printf("%d\n", (int)'A');
//        System.out.printf("%d\n", (int)'Ở');

//        String str1 = "Namxxx";
//        String str2 = "Nam";

//        System.out.println(str1.compareTo(str2));

        List<Student> students = new ArrayList<>();

        students.add(new Student("Huan", 8));
        students.add(new Student("Nam", 8));
        students.add(new Student("Loi", 1));
        students.add(new Student("Tien", 8));
//        Collections.sort(students); => tăng dần
//        Collections.sort(students, Comparator.reverseOrder()); => giảm dần

//        students.sort(Comparator.naturalOrder());
//        students.sort(Comparator.reverseOrder());

        Collections.sort(students, Collections.reverseOrder(new ComparatorScore()));

        System.out.println(students);
    }

}
