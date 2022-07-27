package ss12_map_tree.controller;

import ss12_map_tree.model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapStudy2 {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("SV001", new Student("Nguyễn TẤN hUÂN", 2));
        studentMap.put("SV002", new Student("Nguyễn Tất Thành", 2));
        studentMap.put("SV002", new Student("Nguyễn Văn C", 2));

        Set<String> keys = studentMap.keySet();
        for (String key : keys) {
            System.out.printf("%s - %s\n", key, studentMap.get(key));
        }
    }
}
