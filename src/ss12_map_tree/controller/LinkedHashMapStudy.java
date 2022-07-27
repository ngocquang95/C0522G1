package ss12_map_tree.controller;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapStudy {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new LinkedHashMap<>();

        stringMap.put(7, "A");
        stringMap.put(-1, "D");
        stringMap.put(2, "Nguyễn Tất Thành");
        stringMap.put(3, "Nguyễn Văn C");
        stringMap.put(4, "Nguyễn Văn E");
        stringMap.put(6, "Nguyễn Văn F");
        stringMap.put(100, "");
        stringMap.put(99, "");
        stringMap.put(101, "");

        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
        }
    }
}
