package ss10_dsa_list.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetStudy {
    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(100);
        integerSet.add(100);
        integerSet.add(-100);
        integerSet.add(2);
        integerSet.add(-9);
        integerSet.add(15);

        System.out.println(integerSet);
    }
}
