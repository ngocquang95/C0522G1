package baobao.debug;

public class DebugStudy {
    public static void main(String[] args) {
//        int a = 2;
//        int b = 3;
//
//        int c = a + b;
//
//        System.out.println(c);


//        for (int i = 0; i < 10; i++) {
//            call(i);
//        }
        call2();
    }

    static void call2() {
        main(new String[]{});
    }

    static void call(int i) {
        print(i);
    }

    static void print(int i) {
        System.out.println(i);
    }
}
