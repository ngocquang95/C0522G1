package ss12_map_tree.controller;

import ss12_map_tree.model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapStudy3 {
    public static void main(String[] args) {
        Map<Student, String> studentMap = new HashMap<>();
        Student s1 = new Student("Nguyễn TẤN hUÂN", 2);
        Student s2 = new Student("Nguyễn TẤN hUÂN", 2);

        System.out.println(s1.equals(s2));

        studentMap.put(s1, "SV001");
        studentMap.put(new Student("Nguyễn Tất Thành", 2), "SV002");
        studentMap.put(s2, "SV003");

        Set<Student> keys = studentMap.keySet();
        for (Student key : keys) {
            System.out.printf("%s - %s\n", key, studentMap.get(key));
        }
    }
}
