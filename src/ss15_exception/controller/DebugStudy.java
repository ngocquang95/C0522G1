package ss15_exception.controller;

public class DebugStudy {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            test1(i);
        }

        System.out.println("oke");
        System.out.println("oke");
        System.out.println("oke");
        System.out.println("oke");
        System.out.println("oke");
        System.out.println("oke");
        System.out.println("oke");
        System.out.println("oke");
        System.out.println("oke");
        System.out.println("oke");
    }

    public static void test1(int x) {
        test2(x);
    }

    public static void test2(int x) {
        System.out.println(x);
    }
}
