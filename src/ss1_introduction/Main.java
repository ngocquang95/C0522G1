package ss1_introduction;

public class Main {

    static char x = '\u0000';
    public static void main(String[] args) {
        System.out.println((int) x);
        System.out.println("Hello C0522G1");
        char c = 'a' - 'A';

        byte b = 1; // Khai báo và khởi tạo
        short s; // Khai báo trước
        s = Short.MAX_VALUE;// Khởi tạo sau

        //byte b2 = b + 1;
        // Trong java kiểu số nguyên mặc định là int
        //            số thực mặc định là double
        int i = 2;
        long l = 1000000005512002123L; // phải có hậu tố l hoặc L

        s = 5; // khởi tạo sau
        float f = 1022222222222222222222222222222222444.0F;
        double d1 = 1022222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222444.0D;
        double d2 = 1022222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222445.0D;
        System.out.println(d1 == d2);

        System.out.println(b);
    }
}
