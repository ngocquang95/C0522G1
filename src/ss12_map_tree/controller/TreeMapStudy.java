package ss12_map_tree.controller;

import ss12_map_tree.model.Student;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudy {
    public static void main(String[] args) {
        Map<Student, String> stringMap = new TreeMap<>();

        stringMap.put(new Student(), "A");
//        stringMap.put(-1, "D");
//        stringMap.put(2, "Nguyễn Tất Thành");
//        stringMap.put(3, "Nguyễn Văn C");
//        stringMap.put(4, "Nguyễn Văn E");
//        stringMap.put(6, "Nguyễn Văn F");
//        stringMap.put(100, "");
//        stringMap.put(99, "");
//        stringMap.put(101, "");
//
//        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
//            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
//        }
    }

    // n = 4
    //factorial(4) = factorial(3) * 4 = 6 * 4 = 24
    //factorial(3) = factorial(2) * 3 = 2 * 3 = 6
    // factorial(2) = factorial(1) * 2 = 1 * 2 = 2
    //  factorial(1) = 1
    public long factorial(int n) {
        if (n < 2) {
            return 1;
        }

        return factorial(n - 1) * n;
    }

}
