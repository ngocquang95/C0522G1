package ss11_stack_queue;

import java.util.ArrayList;

public class GenericsStudy {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
//        arrayList.add("1");

        int total = 0;
        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i) instanceof  Integer) {
                total += (Integer) arrayList.get(i);
//            }
        }

        System.out.println("Tổng = " + total);
    }
}
