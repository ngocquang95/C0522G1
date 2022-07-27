package ss12_map_tree.controller;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();

        stringMap.put(1, "Nguyễn TẤN hUÂN");
        stringMap.put(2, "Nguyễn Tất Thành");
        stringMap.put(2, "Nguyễn Văn C");

//        System.out.println(stringMap);
//        System.out.println(stringMap.get(1));

//        Set<Integer> keys = stringMap.keySet();
//        for(Integer key : keys) {
//            System.out.printf("%s - %s\n", key, stringMap.get(key));
//        }

        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
        }
    }
}
