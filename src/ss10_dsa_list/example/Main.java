package ss10_dsa_list.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //generic
        List<Integer> integers = new ArrayList<>();

        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
//        integers.add(40.0);
//        integers.add("Nguyen Tan Huan");
//
//        for (Object o : integers) {
//            if (o instanceof Integer) {
//                Integer x = (Integer) o;
//            }
//        }
//        integers.add(4, 100);
//        integers.set(4, 100);
//        integers.set(0, 1000);

        Integer x = 10;
//        integers.remove(Integer.valueOf(10));
        integers.remove(x);

//        System.out.println(integers.get(0));
        System.out.println(integers);
    }
}
